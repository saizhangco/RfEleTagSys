package com.saizhang.rfsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saizhang.rfsys.domain.Medicine;

@Repository
public interface MedicineDao extends JpaRepository<Medicine, Long> {
	public Medicine findById(long id);
	public Medicine findByName(String name);
}
