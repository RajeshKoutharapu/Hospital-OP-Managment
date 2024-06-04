package com.OpManagment.Hospital_Op_Managment.webLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.OpManagment.Hospital_Op_Managment.Dao.EntityClass;
import com.OpManagment.Hospital_Op_Managment.serviceLayer.ReciverClass;

@Component
public class Sender {
	
	@Autowired
	ReciverClass reciver;

	public void send (rigesterDetails obj) {
		reciver.recive(obj);
	}
	public  List <EntityClass> getDetails(checkpoji pojo) {
		   
		 List <EntityClass> list=reciver.recivedetails(pojo.getPname());
		
		 return list;
		   
	}
}
