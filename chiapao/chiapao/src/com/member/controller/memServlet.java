package com.member.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/mem.do")
public class memServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		doPost(req,res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("UTF-8");
		
		
	}
	

}
