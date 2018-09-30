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
		
		List<String> errorMsgs = new ArrayList();
		req.setAttribute("errorMsgs", errorMsgs);
		
		
		if("insert".equals(action)) {
			
			
			try {
				String branch_No = req.getParameter("branch_No");
				//帳號檢查
				String emp_Acnum = req.getParameter("emp_Acnum").trim();
				String emp_AcnumReq = "^[(A-Za-z0-9_){1,50}]$";
				if(emp_Acnum == null || emp_Acnum.length()==0) {
					errorMsgs.add("帳號尚未填寫");
				}else if (!(emp_Acnum.matches(emp_AcnumReq))) {
					errorMsgs.add("帳號僅可填寫數字和英文");
				}				
				//密碼檢查
				String emp_Psw = req.getParameter("emp_Psw").trim();
				String emp_PswReq = "^[(0-9A-Za-z_)] {1,50}$";
				if(emp_Psw == null || emp_Psw.length()==0) {
					errorMsgs.add("密碼尚未填寫");
				}else if (!(emp_Psw.matches(emp_PswReq))) {
					errorMsgs.add("密碼僅可填寫數字和英文");
				}
				//性別檢查
				String emp_Gender = req.getParameter("emp_Gender");
				if(emp_Gender == null) {
					errorMsgs.add("性別尚未選擇");
				}
				//姓名檢查
				String emp_Name = req.getParameter("emp_Name").trim();
				String emp_NameReq = "^[\u4e00-\u9fa5_a-zA-Z0-9]+$";
				if(emp_Name == null || emp_Name.length() == 0) {
					errorMsgs.add("員工姓名尚未填寫");
				}else if (!(emp_Name.matches(emp_NameReq))) {
					errorMsgs.add("員工姓名僅可填寫中文與英文");
				}
				//電話檢查				
				String emp_Tel = req.getParameter("emp_Tel");
				String emp_TelReq = "^[0-9]+$";
				if(emp_Tel == null || emp_Tel.length()==0) {
					errorMsgs.add("員工電話尚未填寫");
				}else if(!(emp_Tel.matches(emp_TelReq))) {
					errorMsgs.add("電話僅可填數字");
				}
				//職稱選擇
				String emp_Pos = req.getParameter("emp_Pos");
				
				
				//將所勾選的功能包裝成集合
				List<FeatureVO> fealist = new ArrayList<>();
				String valuse[]=req.getParameterValues("fea_No");
				if(valuse != null) {
					for(int i=0 ; i < valuse.length ; i++) {
						System.out.println("valuse[]"+valuse[i]);
						FeatureVO feaVO = new FeatureVO(); 
						feaVO.setFea_No(valuse[i]);
						fealist.add(feaVO);
					}
				}
				
				
				
				
			}catch(Exception e) {
				
			}

			
			
			
			
			
		}
		
	}
	

}
