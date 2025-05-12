package za.ac.tut.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.StudentFacadeLocal;

@WebServlet("/AddStudent")
@MultipartConfig
public class addStudentServlet extends HttpServlet {
    
    @EJB
    private StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String stuno = request.getParameter("stdnum");
            String name = request.getParameter("name");
            String surname = request.getParameter("lname");
            Part part = request.getPart("photo");

            // ✅ Input validation
            if (stuno == null || !stuno.matches("\\d{9}")) {
                throw new IllegalArgumentException("Student number must be exactly 9 digits.");
            }
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }
            if (surname == null || surname.trim().isEmpty()) {
                throw new IllegalArgumentException("Surname cannot be empty.");
            }
            if (part == null || part.getSize() == 0) {
                throw new IllegalArgumentException("Photo must be uploaded.");
            }

            byte[] photo = getPhotoBytes(part);

            Student st = new Student(stuno, name, surname, photo, new Date());
            sfl.create(st);

            request.setAttribute("name", name);
            RequestDispatcher rd = request.getRequestDispatcher("addStudentOutcome.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();  // In production, replace with logger
            request.setAttribute("errorMsg", "An error occurred while adding the student: " + e.getMessage());
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }

    private byte[] getPhotoBytes(Part part) throws IOException {
        try (InputStream is = part.getInputStream();
             ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
             
            byte[] data = new byte[1024];
            int nRead;
            while ((nRead = is.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, nRead);
            }
            return buffer.toByteArray();
        }
    }
}
