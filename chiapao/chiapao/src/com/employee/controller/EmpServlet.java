package com.employee.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.feature.model.FeatureVO;

public class EmpServlet extends HttpServlet{
	
	public void doGet (HttpServletRequest req,HttpServletResponse res)throws  ServletException{
		
		
		
		
	}
		
	public void doPost (HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		
		if("insert".equals(action)) {
			String branch_No = req.getParameter("branch_No");
			String emp_Acnum = req.getParameter("emp_Acnum");
			String emp_Psw = req.getParameter("emp_Psw");
			String emp_Gender = req.getParameter("emp_Gender");
			
			String emp_Name = req.getParameter("emp_Name");
			
			String emp_Tel = req.getParameter("emp_Tel");
			String emp_Pos = req.getParameter("emp_Pos");
			List<FeatureVO> fealist = new ArrayList<>();
			String fea_No[]=req.getParameterValues("fea_No");
			
			
			
			
			
		}
		
	}
	

}
