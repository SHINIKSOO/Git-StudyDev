package com.SampleMybatisWeb.controller;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SampleMybatisWeb.dao.JdbcBoardDao;
import com.SampleMybatisWeb.dao.MybatisBoardDao;



@RequestMapping(value="/sample")
@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
    
	@Autowired
	private MybatisBoardDao dao;
	
	@Autowired
	private SqlSessionFactory sqlsession;
	
	@RequestMapping(value="/board")
	public String selectAll(Model model) {
		
		try {
			//System.out.println("시스템프린트:전체검색");
			//Connection conn = (Connection)ds.getConnection();
			//SqlSession session = sqlsession.openSession();
			//System.out.println("성공"+session);
			System.out.println("마이바티스 실행");
			model.addAttribute("vo", dao.selectAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("실패");
			e.printStackTrace();
		}
		return "board/selectAll";
	}
}
