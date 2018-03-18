package com.saizhang.rfsys.service;

import java.util.List;

import com.saizhang.rfsys.domain.Medicine;

public interface MedicineService {
	//CRUD
	void createMedicine(Medicine medicine);
	void deleteMedicine(long id);
	void updateMedicine(Medicine medicine);
	Medicine findByMedicineId(long id);
	Medicine findByMedicineName(String name);
	List<Medicine> findAll();
}
