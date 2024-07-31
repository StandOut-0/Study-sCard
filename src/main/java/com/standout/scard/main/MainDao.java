package com.standout.scard.main;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainDao {
	int selectCountAll();
	List<MainVO> selectPersonAll();

	void insertPerson(MainVO person);
}
