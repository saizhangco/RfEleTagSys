package com.saizhang.rfsys.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saizhang.rfsys.service.MedicineTakeRecordService;

@Controller
@RequestMapping("/takeRecord")
public class MedicineTakeRecordController {

	@SuppressWarnings("unused")
	@Autowired
	private MedicineTakeRecordService medicineTakeRecordService;
	
}
