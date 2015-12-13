package com.ioc.logic;

import com.ioc.idao.IDao;
import com.ioc.ilogic.ILogic;

public class TestLogic implements ILogic {
	IDao dao;
	public void print() {
		dao.print();
	}
	
	// 用于set注入
	public void setDao(IDao dao) {
		this.dao = dao;
	}
}
