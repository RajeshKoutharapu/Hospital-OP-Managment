package com.OpManagment.Hospital_Op_Managment.serviceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OpManagment.Hospital_Op_Managment.Dao.WardRepository;
import com.OpManagment.Hospital_Op_Managment.Dao.Word;

@Service
public class WardService {

    @Autowired
    private WardRepository wardRepository;

    public Word findWardById(String wardId) {
        return wardRepository.findByWardName(wardId);
    }

    public void saveWard(Word ward) {
        wardRepository.save(ward);
    }
}

