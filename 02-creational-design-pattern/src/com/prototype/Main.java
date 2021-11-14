package com.prototype;

import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Johnny");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("John");
		
		System.out.println("Original Emps List: "+emps.getEmpList());
		System.out.println("New EmpsNew List: "+list);
		System.out.println("After Modifying EmpsNew List: "+list1);
	}
}
