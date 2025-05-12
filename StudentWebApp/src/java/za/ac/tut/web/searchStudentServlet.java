package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.StudentFacadeLocal;

@WebServlet("/searchStudent")
public class searchStudentServlet extends HttpServlet {
    @EJB
    private StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String stuno = request.getParameter("stuno");

            
            if (stuno == null || !stuno.matches("\\d{9}")) {
                throw new IllegalArgumentException("Student number must be exactly 9 digits.");
            }

            Student st = sfl.find(stuno);
            request.setAttribute("st", st);
            RequestDispatcher rd = request.getRequestDispatcher("searchOutcome.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace(); 
            request.setAttribute("errorMsg", "Error searching for student: " + e.getMessage());
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }
}
