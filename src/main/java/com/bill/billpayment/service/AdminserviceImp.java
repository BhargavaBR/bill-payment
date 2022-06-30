package com.bill.billpayment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Admindao;
import com.bill.billpayment.entities.Aminlogin;
@Service
@Component
public class AdminserviceImp implements Adminservice
{
@Autowired
private Admindao adao;

	@Override
	public boolean login(Aminlogin adminlogin)
	{
		Optional<Aminlogin> al=adao.findById(adminlogin.getUsername());
		Aminlogin ad=al.get();
		if(ad!=null)
		{
			return ad.getPassword().equals(adminlogin.getPassword());
		}
		return false;
}
	


}	
