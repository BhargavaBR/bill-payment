package com.bill.billpayment.controllers;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.bill.billpayment.entities.Aminlogin;

import com.bill.billpayment.service.Adminservice;

@Controller
public class AdminController 
{
@Autowired
private Adminservice as;
@GetMapping("/admin")
public String login(Model model)
{
	Aminlogin al=new Aminlogin();
	model.addAttribute("admin",al);
	return "adminlogin";
}
@PostMapping("/adminlogin")
public String loginverify(@Valid @ModelAttribute("admin") Aminlogin al,BindingResult result,Model model,HttpSession session)
{
if(result.hasErrors())	
{
	return "adminlogin";
}
else
{
	boolean status=as.login(al);
	if(status)
	{
		session.setAttribute("adminusername", al.getUsername());
		
		return "adminportal";
	}
	else
	{
	model.addAttribute("message", "Invalid UserName or Password");
		return "adminlogin";
	}


}}



}
