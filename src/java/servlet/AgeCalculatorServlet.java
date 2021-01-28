/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 828200
 */
public class AgeCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
              .forward(request,response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age=request.getParameter("age");
        request.setAttribute("age",age);
        if(age == null)
        {
            request.setAttribute("message","You must give your current age");
                   getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                  .forward(request,response);

                 return;
        }
        if(age.contains("[a-zA-Z]+")|| age.equals("") )
         {
             request.setAttribute("message","You must enter a number");
               getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
              .forward(request,response);
         
             return;
         }
        request.setAttribute("awnser","You're age next birthday is ${age}");
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
              .forward(request,response);
    }

}
