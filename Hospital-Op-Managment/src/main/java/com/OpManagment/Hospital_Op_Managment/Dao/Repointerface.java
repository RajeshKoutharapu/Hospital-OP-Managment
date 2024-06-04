package com.OpManagment.Hospital_Op_Managment.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repointerface extends JpaRepository<EntityClass, Integer>{
	public List<EntityClass> findBypname(String name);

}
