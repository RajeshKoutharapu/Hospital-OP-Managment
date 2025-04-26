package com.OpManagment.Hospital_Op_Managment.Dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.OpManagment.Hospital_Op_Managment.webLayer.rigesterDetails;

@Component
public class insertdetails {
	@Autowired
	Repointerface repo;
	public void Insert(LocalDate rigesterDay,LocalDate lastDay,rigesterDetails info) {
		EntityClass obj=new EntityClass();
	    obj.setPname( info.getPname());
	    obj.setPlocation( info.getPlocation());
        obj.setPage( info.getPage());
        obj.setPdoctor( info.getPdoctor());
        obj.setPname( info.getPname());
        obj.setRigesterDay(rigesterDay);
	    obj.setLastDay(lastDay);
	    repo.save(obj);
	}

}
