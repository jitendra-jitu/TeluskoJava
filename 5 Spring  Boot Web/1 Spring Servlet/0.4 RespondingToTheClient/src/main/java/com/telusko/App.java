package com.telusko;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        Tomcat t=new Tomcat();

//        t.setPort(8081);

        

        Context context = t.addContext("", null);
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");


        t.start();
        t.getServer().await();

//        changing the embed-apache port
//        t.setPort(9090);
    }
}





