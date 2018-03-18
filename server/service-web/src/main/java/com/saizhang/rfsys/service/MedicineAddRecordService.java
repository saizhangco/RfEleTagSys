package com.saizhang.rfsys.service;

import java.util.List;

import com.saizhang.rfsys.domain.MedicineAddRecord;;

public interface MedicineAddRecordService{
	//CRUD
	void createRecord(MedicineAddRecord record);
	void deleteRecord(long id);
	void updateRecord(MedicineAddRecord record);
	MedicineAddRecord findByRecordId(long id);
	List<MedicineAddRecord> findAll();
}
