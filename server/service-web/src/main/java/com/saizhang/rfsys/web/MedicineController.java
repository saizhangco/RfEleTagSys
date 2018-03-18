package com.saizhang.rfsys.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saizhang.rfsys.domain.Medicine;
import com.saizhang.rfsys.service.MedicineService;

@Controller
@RequestMapping(path="/medicine")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;
	
	@GetMapping("/list")
	public ResponseEntity<Object> list(){
		List<Medicine> list = medicineService.findAll();
		return ResponseEntity.ok().body(list);
	}
}
