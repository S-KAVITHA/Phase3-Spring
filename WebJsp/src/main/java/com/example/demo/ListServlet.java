package com.example.demo;
 
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.dao.CategoryDAO;
import com.example.demo.model.Categorys;
 
@WebServlet("/list")
public class ListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDAO dao = new CategoryDAO();
 
        try {
 
            List<Categorys> listCatagory = dao.list();
            request.setAttribute("listCategory", listCatagory);
 
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int categoryId = Integer.parseInt(request.getParameter("category"));
 
        request.setAttribute("selectedCatId", categoryId);
 
        listCategory(request, response);
    }
}


}