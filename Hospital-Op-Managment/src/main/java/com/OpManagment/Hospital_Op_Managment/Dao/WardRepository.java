package com.OpManagment.Hospital_Op_Managment.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface WardRepository extends JpaRepository<Word, Integer> {
	 Word findByWardName(String wardName);
}
