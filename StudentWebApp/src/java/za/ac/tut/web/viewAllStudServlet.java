/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.StudentFacadeLocal;

/**
 *
 * @author syabo
 */
@WebServlet("/viewAllStud")
public class viewAllStudServlet extends HttpServlet 
{
    @EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> list = sfl.findAll();
        
        request.setAttribute("list", list);
        
        RequestDispatcher rd = request.getRequestDispatcher("viewAllOutcme.jsp");
        rd.forward(request, response);
    }
}
