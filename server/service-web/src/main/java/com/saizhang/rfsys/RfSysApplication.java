package com.saizhang.rfsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan("com.saizhang.rfsys.domain")
//@EnableJpaRepositories("com.saizhang.rfsys.dao")
public class RfSysApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RfSysApplication.class, args);
	}
}
