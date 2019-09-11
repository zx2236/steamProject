package com.gpch.login.service;

import com.gpch.login.model.Master;
import com.gpch.login.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("masterService")
public class MasterService {

    private MasterRepository masterRepository;

    @Autowired
    public MasterService(MasterRepository masterRepository) {
        this.masterRepository = masterRepository;
    }

    public List<Master> findAll() {
        return masterRepository.findAll();
    }
}