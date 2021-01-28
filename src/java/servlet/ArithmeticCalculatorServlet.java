package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
             request.setAttribute("message","_ _ _");
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
              .forward(request,response);
         
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String First=request.getParameter("First");
        request.setAttribute("First",First);
        String Second=request.getParameter("Second");
        request.setAttribute("Second",Second);
        if(First == null || Second == null || !First.equals("[0-9]+") || !Second.equals("[0-9]+"))
        {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
              .forward(request,response);
            return;
        }
        int one=Integer.parseInt(First);
        int two=Integer.parseInt(Second);
        int awnser=0;
        String how=request.getParameter("submit");
        if(how.equals("+"))
        {awnser=one+two;}
        if(how.equals("-"))
        {awnser=one-two;}
       if(how.equals("*"))
        {awnser=one*two;}
      if(how.equals("%"))
        {awnser=one%two;}
        request.setAttribute("message", awnser);
        
    }

  

}
