/*
Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.
*/
package com.prime;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // HTML Output
            out.println("<html><body>");
            out.println("<h2>Result</h2>");
            out.println("<p>Number: " + number + "</p>");
            if (isPrime) {
                out.println("<p><b>" + number + " is a Prime Number</b></p>");
            } else {
                out.println("<p><b>" + number + " is NOT a Prime Number</b></p>");
            }
            out.println("<a href='index.html'>Try Another</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body><p style='color:red;'>Invalid input. Please enter a valid number.</p>");
            out.println("<a href='index.html'>Back</a>");
            out.println("</body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}


/*
Index.html
*/
<!DOCTYPE html>
<html>
<head>
    <title>Prime Number Checker</title>
</head>
<body>
    <h2>Check Prime Number</h2>
    <form action="prime" method="post">
        Enter a number: <input type="number" name="number" required>
        <input type="submit" value="Check">
    </form>
</body>
</html>
