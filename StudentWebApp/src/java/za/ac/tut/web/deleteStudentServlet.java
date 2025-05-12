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

@WebServlet("/deleteStudent")
public class deleteStudentServlet extends HttpServlet 
{
    @EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    try {
        String stdno = request.getParameter("stdno");

        // ✅ Validate that student number is exactly 9 digits
        if (stdno == null || !stdno.matches("\\d{9}")) {
            throw new IllegalArgumentException("Student number must be exactly 9 digits.");
        }

        Student st = sfl.find(stdno);
        if (st == null) {
            throw new IllegalArgumentException("Student with number " + stdno + " not found.");
        }

        sfl.remove(st);  // Remove the student

        request.setAttribute("st", st);
        RequestDispatcher rd = request.getRequestDispatcher("deleteOutcome.jsp");
        rd.forward(request, response);

    } catch (Exception e) {
        e.printStackTrace();  // Log the exception
        request.setAttribute("errorMsg", "Error deleting student: " + e.getMessage());
        RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
        rd.forward(request, response);
    }
}
}

