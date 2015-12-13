package com.ioc.dao;

import com.ioc.idao.IDao;

public class TestDao implements IDao {
	public void print() {
		System.out.println("demo of spring IoC");
	}
}
