package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
	ServletConfig conf;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		conf=getServletConfig();
		return conf;
	}

	@Override
	public String getServletInfo() {
		return "This servlet is created by Rajesh";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("SirstServlet.init()::one param");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("SirstServlet.service()");		
//		set content type MIME
		arg1.setContentType("text/html");
		
		PrintWriter pw =arg1.getWriter();
		pw.println("<h1 style='text-align:center;color:red'>This is my First page in Servlet</h1>");
		pw.println("<h2 style='text-align:center;color:blue'>Todays Date is :: "+new Date().toString()+"</h2>");
		
		
		pw.close();
	}
	

}
