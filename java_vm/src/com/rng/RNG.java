package com.rng;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RNG
 */
@WebServlet("/")
public class RNG extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		
//		int num = (int)(Math.random() * 1000000);
//		
////		response.setContentType("application/json");
////		
////		response.setCharacterEncoding("utf-8");
//		
////		response.setContentType("text/plain; charset=utf-8");
//		response.setContentType("application/json; charset=utf-8");
//		
//		
//		String randomNumJson = "{\n    \"number\": " + "\"" + Integer.toString(num) + "\"\n}";
//		
////		out.print(randomNumJson);
////		out.flush();
//	
//		response.getWriter().write(randomNumJson);
//		response.getWriter().flush();
		
		response.setContentType("application/json; charset=utf-8");
		
		String testJson = "{\r\n" + 
				"  \"userId\": 1,\r\n" + 
				"  \"id\": 1,\r\n" + 
				"  \"title\": \"delectus aut autem\",\r\n" + 
				"  \"completed\": false\r\n" + 
				"}";
		
		response.getWriter().write(testJson);
	}

}
