package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.StudentFacadeLocal;

@WebServlet("/CountStudents")
public class countServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal sfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Integer count = sfl.count();  // Gets the number of students
            request.setAttribute("count", count);
            RequestDispatcher rd = request.getRequestDispatcher("countOutcome.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();  // Replace with a logger in production
            request.setAttribute("errorMsg", "Error retrieving student count: " + e.getMessage());
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }
}
