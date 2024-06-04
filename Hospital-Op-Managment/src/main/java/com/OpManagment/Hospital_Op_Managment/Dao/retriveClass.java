package com.OpManagment.Hospital_Op_Managment.Dao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class retriveClass {
	@Autowired
	Repointerface Repo;
	public List<EntityClass> retrive(String name) {
		
		List<EntityClass> list=Repo.findBypname(name);
		
		return list;
	}

}
