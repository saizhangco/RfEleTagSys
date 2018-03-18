package com.saizhang.rfsys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saizhang.rfsys.service.MedicineAddRecordService;

@Controller
@RequestMapping("/addRecord")
public class MedicineAddRecordController {

	@SuppressWarnings("unused")
	private MedicineAddRecordService medicineAddRecordService;
}
