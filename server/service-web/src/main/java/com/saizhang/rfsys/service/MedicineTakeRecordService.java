package com.saizhang.rfsys.service;

import java.util.List;

import com.saizhang.rfsys.domain.MedicineTakeRecord;

public interface MedicineTakeRecordService {
	//CRUD
	void createRecord(MedicineTakeRecord record);
	void deleteRecord(long id);
	void updateRecord(MedicineTakeRecord record);
	MedicineTakeRecord findByRecordId(long id);
	List<MedicineTakeRecord> findAll();
}
