package com.thomas;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();

        //Since we are using the same project no need for contextPath
        //Since no new directory needed , put docBase null
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");


        tomcat.start();
        tomcat.getServer().await();
    }
}
