package com.telusko;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
//
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet("/hello")//use this Annotation when we are external Tomcat
public class
HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

//    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        System.out.println("Service Method!!");
////        res.getWriter().println("hello servlet");
//
//        res.setContentType("text/html");
//        PrintWriter out =res.getWriter();
//        out.println("<marquee>hello jitu</marquee>");
//
//    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Service Method!!");
//        res.getWriter().println("hello servlet");

        res.setContentType("text/html");
        PrintWriter out =res.getWriter();
        out.println("<marquee><h1>hello jitu</h1></marquee>");

    }

}
