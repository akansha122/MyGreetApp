package com.zensar.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/Greet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() is called");
	}

	/**
	 * @see Servlet#destroy()
	 */

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        System.out.println("Service() is called");
        PrintWriter  out = response.getWriter();
        out.println("<body bgcolor='pink'");
        out.println("<p> Welcome to servlet</p>");
        out.println( "</body>");
    }

	public void destroy() {
		System.out.println("destroy() is called");
	}
}
