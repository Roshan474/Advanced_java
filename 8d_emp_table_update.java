/*
<!-- Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively -->
*/
<%@ page import="java.sql.*" %>
<%
    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String salaryStr = request.getParameter("basicsalary");

    int empNo = Integer.parseInt(empNoStr);
    int salary = Integer.parseInt(salaryStr);

    String url = "jdbc:mysql://localhost:3306/employee";
    String user = "root";
    String password = ""; // your MySQL password

    Connection con = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);

        String insertSQL = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        ps = con.prepareStatement(insertSQL);
        ps.setInt(1, empNo);
        ps.setString(2, empName);
        ps.setInt(3, salary);

        int result = ps.executeUpdate();
        if(result > 0) {
            out.println("<h3>Record inserted successfully!</h3>");
        } else {
            out.println("<h3>Failed to insert the record.</h3>");
        }

    } catch(Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    } finally {
        if(ps != null) ps.close();
        if(con != null) con.close();
    }
%>

/*
html code
*/

<html>
<head><title>Insert Employee</title></head>
<body>
<h2>Enter Employee Details</h2>
<form action="insertEmpAction.jsp" method="post">
  Emp No: <input type="text" name="empno" required><br><br>
  Emp Name: <input type="text" name="empname" required><br><br>
  Basic Salary: <input type="text" name="basicsalary" required><br><br>
  <input type="submit" value="Insert">
</form>
<a href="viewEmp.jsp" style="font-size:16px; color:blue;">Click here to view all employee records</a><br>
<a href="updateEmpForm.jsp">Update List</a>
</body>
</html>

/*
  update_emp.jsp
  */


  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String salaryStr = request.getParameter("basicsalary");

    int empNo = Integer.parseInt(empNoStr);
    int salary = Integer.parseInt(salaryStr);

    String url = "jdbc:mysql://localhost:3306/employee";
    String user = "root";
    String password = ""; // change if your MySQL has a password

    Connection con = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);

        // Check if employee exists
        ps = con.prepareStatement("SELECT Emp_NO FROM Emp WHERE Emp_NO = ?");
        ps.setInt(1, empNo);
        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            out.println("<h3 style='color:red;'>Error: Employee ID " + empNo + " not found!</h3>");
        } else {
            ps.close();

            // Perform update
            ps = con.prepareStatement("UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?");
            ps.setString(1, empName);
            ps.setInt(2, salary);
            ps.setInt(3, empNo);

            int result = ps.executeUpdate();
            if (result > 0) {
                out.println("<h3 style='color:green;'>Record updated successfully for Emp No: " + empNo + "</h3>");
            } else {
                out.println("<h3 style='color:red;'>Update failed.</h3>");
            }
        }

    } catch(Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    } finally {
        if (ps != null) ps.close();
        if (con != null) con.close();
    }
%>
<br><br>
<a href="viewEmp.jsp">← Back to Employee List</a>



  /*
  update emp form.jsp
  */

  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head><title>Update Employee</title></head>
<body>
<h2>Update Employee Details</h2>
<form action="updateEmpAction.jsp" method="post">
  Emp No (to update): <input type="text" name="empno" required><br><br>
  New Emp Name: <input type="text" name="empname" required><br><br>
  New Basic Salary: <input type="text" name="basicsalary" required><br><br>
  <input type="submit" value="Update Employee">
</form>

<br><br>
<a href="viewEmp.jsp">← Back to Employee List</a>
</body>
</html>

  
