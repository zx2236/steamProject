package com.gpch.login.repository;

import java.util.List;
import com.gpch.login.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("masterRepository")
public interface MasterRepository extends JpaRepository<Master, Long> {
    //List<Master> findAllById(String itemId);
    List<Master> findAll();
}