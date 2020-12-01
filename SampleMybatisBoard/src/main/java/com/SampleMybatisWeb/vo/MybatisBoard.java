package com.SampleMybatisWeb.vo;

public class MybatisBoard {
	/*-- create table mybatisboard(
			--     bno int, //primary key 글넘버
			--     btitle varchar(100), 글제목
			--     bcontent varchar(200), 글내용
			--     bid varchar(50), 작성자
			--     bdate datetime 작성날짜
			-- )*/
	
	private int bno;
	private String btitle;
	private String bcontent;
	private String bid;
	private String bdate;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	
}
