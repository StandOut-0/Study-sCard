package com.standout.scard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.standout.scard.main")
public class StudySCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySCardApplication.class, args);
	}

}
