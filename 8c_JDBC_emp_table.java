/*
<!-- Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
....
...
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
Grand Salary : 45000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
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
    Html Code
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
<a href="viewEmp.jsp" style="font-size:16px; color:blue;">Click here to view all employee records</a>
</body>
</html>
