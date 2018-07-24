/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CategoryDAO;
import Model.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.rmi.server.Dispatcher;

/**
 *
 * @author Admin
 */
public class CartServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        CategoryDAO category=new CategoryDAO();
//        try {
//            ArrayList<Category> list=new ArrayList<>();
//           list= category.getListCategorys();
//           request.setAttribute("category", list);
//        } catch (SQLException ex) {
//            Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        String url="/product.jsp";
//        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
//        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        CategoryDAO category=new CategoryDAO();
//        try {
//            ArrayList<Category> list=new ArrayList<>();
//           list= category.getListCategorys();
//           request.setAttribute("listcategory", list);
//        } catch (SQLException ex) {
//            Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        String url="/product.jsp";
//        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
//        rd.forward(request, response);
//    }


}
}
