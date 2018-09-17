package com.member.controller;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.member.model.*;
@WebServlet("/mem.do")
@MultipartConfig
public class MemServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		doPost(req,res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");
		
//***********************getimg***********************************************************		
		Part part = req.getPart("menu_Photo");
		InputStream in = part.getInputStream();
		byte[] menu_Photo = new byte[in.available()];
		
		
		if("insert".equals(action)){  // 來自register.jsp的請求  
			List<String> errorMsgs = new LinkedList<>();
			req.setAttribute("errorMsgs", errorMsgs);
			
			try {
				/***************************1.接收請求參數****************************************/
				
				//帳號驗證
				String mem_Id = req.getParameter("mem_Id").trim();
				String mem_IdReg = "^[(a-zA-Z0-9_)]{2,50}$";
				if(mem_Id == null || mem_Id.length() == 0) {
					errorMsgs.add("尚未填寫帳號");
				}  else if(!mem_Id.trim().matches(mem_IdReg)) {
					errorMsgs.add("帳號須為英文或數字或底線");
				}
				
				//密碼驗證
				String mem_Pw = req.getParameter("mem_Pw").trim();
				if(mem_Pw == null || mem_Pw.length() == 0) {
					errorMsgs.add("尚未填寫密碼");
				} else if(mem_Id.length() >= 20) {
					errorMsgs.add("餐點類型:長度需小於20個字元 ");
				}
				//姓名驗證
				String mem_Name = req.getParameter("mem_Name");
				String mem_NameReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9)]$";
				if (mem_Name == null || (mem_Name.trim()).length() == 0) {
					errorMsgs.add("尚未填寫姓名");
				}else if(!mem_Name.trim().matches(mem_NameReg)) {
					errorMsgs.add("姓名僅能填寫中文與英文");
				}
				
				//性別選擇
				String mem_Gender = req.getParameter("mem_Gender");
				if(mem_Gender == null) {
					errorMsgs.add("尚未選擇性別");
				}
				
				//生日驗證
				String mem_Bir = req.getParameter("mem_Bir");
				if(mem_Bir == null) {
					errorMsgs.add("尚未填寫生日");
				}
				
				//信箱驗證
				String mem_Mail = req.getParameter("mem_Mail");
				if(mem_Mail == null || mem_Mail.trim().isEmpty()) {
					errorMsgs.add("尚未填寫信箱");
				}
				
				//手機驗證
				String mem_Phone = req.getParameter("mem_Phone");
				String mem_PhoneReg = "^[(0-9)]$";
				if(mem_Phone == null || mem_Phone.trim().isEmpty()) {
					errorMsgs.add("尚未填寫電話");			
				}else if (!(mem_Phone.trim().matches(mem_PhoneReg))) {
					errorMsgs.add("電話僅能輸入數字");
				}
				//預設收件人驗證
				String mem_Receiver = req.getParameter(mem_Receiver);
				String mem_ReceiverReg = "[(\\u4e00-\\u9fa5)(a-zA-Z0-9)]$";
				if(mem_Receiver.isEmpty()) {				
				}
				else if(!(mem_ReceiverReg.trim().matches(mem_ReceiverReg))) {
					errorMsgs.add("收件人僅能填寫中文與英文");
				}
				
				//預設收件人電話驗證
				String mem_Repno = req.getParameter(mem_Repno);
				String mem_RepnoReg = "^[0-9]$";
				if(mem_Repno.isEmpty()) {
					
				}else if(!(mem_Repno.trim().matches(mem_RepnoReg))) {
					errorMsgs.add("電話僅能輸入數字");
				}
				
				

				
				MenuVO menuVO = new MenuVO();
				menuVO.setMenu_Id(menu_Id);
				menuVO.setMenu_Type(menu_Type);
				menuVO.setMenu_Price(menu_Price);
				menuVO.setMenu_Intro(menu_Intro);
				menuVO.setMenu_Photo(menu_Photo);
				menuVO.setMenu_Status(menu_Status);
				
				if(!errorMsgs.isEmpty()) {
					req.setAttribute("menuVO", menuVO);  // 含有輸入格式錯誤的perntdVO物件,也存入req
					RequestDispatcher failureView = req.getRequestDispatcher("/front_end/testimgupload/addMenu.jsp");
					failureView.forward(req, res);
					return; //程式中斷
				}
				
				/***************************2.開始新增資料****************************************/
				MenuService menuSvc = new MenuService();
				menuVO = menuSvc.addMenu(menu_Id, menu_Type, menu_Price, menu_Intro, menu_Photo, menu_Status);
								
				/***************************3.新增完成,準備轉交(Send the Success view)************/
				req.setAttribute("menuVO", menuVO);  // 資料庫新增成功後,正確的的perntdVO物件,存入req
				RequestDispatcher successView = req.getRequestDispatcher("/front_end/testimgupload/listAllMenu.jsp");
				successView.forward(req, res);
				
				/***************************其他可能的錯誤處理**********************************/
			} catch(Exception e) {
				errorMsgs.add("資料新增失敗"+e.getMessage());
				RequestDispatcher failuerView = req.getRequestDispatcher("/front_end/testimgupload/addMenu.jsp");
				failuerView.forward(req, res);
			}
		}
		
	}
	
	
	

}
