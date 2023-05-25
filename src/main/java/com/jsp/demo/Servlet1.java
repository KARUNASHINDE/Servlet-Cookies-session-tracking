package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= req.getParameter("name");
		Cookie cookie = new Cookie("cname", name);
		resp.addCookie(cookie);
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body><h1>"+"welcome"+name+" to my website "+"</h1></body></html>");
	printWriter.print("<a href = 'servlet2'> go  to my website </a>");
	
	}
	
	
	
}
