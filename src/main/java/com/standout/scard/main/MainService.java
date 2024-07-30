package com.standout.scard.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService { 
	@Autowired
	MainDao maindao;
	
	public int selectCountAll() {return maindao.selectCountAll();}
	public List<MainVO> selectPersonAll() {return maindao.selectPersonAll();}
}
