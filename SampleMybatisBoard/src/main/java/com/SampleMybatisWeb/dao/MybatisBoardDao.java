package com.SampleMybatisWeb.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SampleMybatisWeb.vo.MybatisBoard;

@Repository
public class MybatisBoardDao {

	@Autowired
	private SqlSession session;
	
	public List<MybatisBoard> selectAll(){
		List<MybatisBoard> list = session.selectList("boardmapper.selectAll");
		return list;
	}
}
