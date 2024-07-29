package com.standout.scard.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	 
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	 @GetMapping("/test-db")
	    @ResponseBody
	    public String testDatabaseConnection() {
	        try {
	            // 간단한 쿼리 실행으로 연결 테스트
	            Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
	            return "Database connection test result: " + result;
	        } catch (Exception e) {
	            return "Database connection test failed: " + e.getMessage();
	        }
	    }

}
