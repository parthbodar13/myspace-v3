package com.nyspace.masterdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "com.myspace.commonservice.entity" })
public class MasterDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterDataServiceApplication.class, args);
	}

}
