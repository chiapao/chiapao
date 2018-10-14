package com.generalmanager.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ManagerServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException  {
		
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		if("login".equals(action)) {
			List<String> errorMsgs = new ArrayList();
			req.setAttribute("errorMsgs", errorMsgs);
			try {
				
			String merg_Acnum = req.getParameter("merg_Acnum");
			String merg_Psw = req.getParameter("merg_Psw");
			
			}catch(Exception e) {
				
				errorMsgs.add("資料新增失敗");
				RequestDispatcher failuerView = req.getRequestDispatcher("/back_end/employee/RegistEmp.jsp");
				failuerView.forward(req, res);
				System.out.println(e.getMessage());
				
			}
			
		}
	}
}
