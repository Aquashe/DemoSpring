package com.thomas;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public  void  doGet(HttpServletRequest req , HttpServletResponse res ){
        System.out.println("In service");
        try {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<h2><b>Hello world</b></h2>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
