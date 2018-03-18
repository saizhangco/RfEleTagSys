package com.saizhang.rfsys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saizhang.rfsys.dao.MedicineDao;
import com.saizhang.rfsys.domain.Medicine;
import com.saizhang.rfsys.service.MedicineService;

@Service("medicineService")
public class MedicineServiceImpl implements MedicineService {

	private MedicineDao medicineDao;
	
	@Override
	public void createMedicine(Medicine medicine) {
		medicineDao.save(medicine);
	}

	@Override
	public void deleteMedicine(long id) {
		medicineDao.delete(id);
	}

	@Override
	public void updateMedicine(Medicine medicine) {
		medicineDao.save(medicine);
	}

	@Override
	public Medicine findByMedicineId(long id) {
		return medicineDao.findById(id);
	}

	@Override
	public Medicine findByMedicineName(String name) {
		return medicineDao.findByName(name);
	}

	@Override
	public List<Medicine> findAll() {
		return medicineDao.findAll();
	}

}
