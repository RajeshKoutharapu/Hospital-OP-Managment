package com.OpManagment.Hospital_Op_Managment.serviceLayer;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import com.OpManagment.Hospital_Op_Managment.Dao.EntityClass;
import com.OpManagment.Hospital_Op_Managment.Dao.insertdetails;
import com.OpManagment.Hospital_Op_Managment.Dao.retriveClass;
import com.OpManagment.Hospital_Op_Managment.webLayer.checkpoji;
import com.OpManagment.Hospital_Op_Managment.webLayer.rigesterDetails;

import jakarta.persistence.Entity;

@Service
public class ReciverClass {
  @Autowired
	insertdetails insert;
  @Autowired
  retriveClass retrive;
	public void recive( rigesterDetails info) {
		LocalDate registerDay=LocalDate.now();
		Period thirtyDays = Period.ofDays(30);
	    LocalDate lastDay = registerDay.plus(thirtyDays);
	    insert.Insert(registerDay, lastDay, info);
	    
	}
	public List<EntityClass> recivedetails(String name){
		
		List<EntityClass> list=retrive.retrive(name);
		return list;
	}
}
