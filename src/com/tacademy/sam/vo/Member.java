package com.tacademy.sam.vo;

import java.io.Serializable;

public class Member implements Serializable {

	private static final long serialVersionUID = 60833632815594648L;

	// 이름, 주소, 나이
	private String name;
	private String address;
	private int age;
	
	public Member(){};
	public Member(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}
