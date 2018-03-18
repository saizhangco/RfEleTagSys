package com.saizhang.rfsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saizhang.rfsys.domain.MedicineTakeRecord;

@Repository
public interface MedicineTakeRecordDao extends JpaRepository<MedicineTakeRecord, Long> {

}
