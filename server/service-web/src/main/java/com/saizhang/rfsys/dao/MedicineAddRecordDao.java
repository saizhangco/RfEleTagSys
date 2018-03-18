package com.saizhang.rfsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saizhang.rfsys.domain.MedicineAddRecord;

@Repository
public interface MedicineAddRecordDao extends JpaRepository<MedicineAddRecord, Long> {

}
