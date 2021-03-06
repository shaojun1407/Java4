package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */

@WebServlet(description = "demo servlet", urlPatterns = {"/Servlet2/ServletDemo","/abc","/123"})
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletDemo() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("Served at: ").append(request.
		 * getContextPath());
		 */
		response.setContentType("text/html;charset=UTF-8");// 设置生成的文档类型防止输出内容乱码,通常需要在输出前设置！否则无效！
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");// 输出相应的HTML源文件
		out.println("<BODY>");
		out.println("<H2>我们正在学习Servlet编程</H2>");
		out.println("<H3>现在时间是: " + new Date() + "</H3>");// 输出系统时间
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
