package com.SampleMybatisWeb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import com.SampleMybatisWeb.vo.MybatisBoard;

@Repository
public class JdbcBoardDao {
	private static final Logger logger = LoggerFactory.getLogger(JdbcBoardDao.class);
	//Mysql과 연결을 위한 객체를 생성
	private Connection conn;
	
	JdbcBoardDao(){
		String dburl ="jdbc:mysql://localhost:3306/bbs?serverTimezone=UTC";
		String dbid = "root";
		String dbpw = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbid,dbpw);
			logger.debug("연결이 성공되었습니다");
			//System.out.println("logger:연결이 성공되었습니다.");
			
		} catch (Exception e) {
	        	e.printStackTrace();
		}
		
	}
	
	public List<MybatisBoard> selectAll(){
            Statement stmt = null;
		
		  List<MybatisBoard> list = new ArrayList<MybatisBoard>();
		  
		  try {stmt = conn.createStatement();//쿼리문을 날릴 객체연결
		  ResultSet rs =
		  stmt.executeQuery("select bno,btitle,bcontent,bid,bdate from mybatisboard");
		  while(rs.next()) { MybatisBoard vo = new MybatisBoard();
		  vo.setBno(rs.getInt(1)); vo.setBtitle(rs.getString(2));
		  vo.setBcontent(rs.getString(3)); vo.setBid(rs.getString(4));
		  vo.setBdate(rs.getString(5));
		  
		  list.add(vo);  
		  
		  return list; 
		  
		  
		  }
		  
		  
		  }catch (Exception e) {
		  
		  e.printStackTrace(); 
		  }
	 
       return null;
	}
	
	
	
	
}
