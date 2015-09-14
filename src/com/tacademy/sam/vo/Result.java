package com.tacademy.sam.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class Result implements Serializable {

	private static final long serialVersionUID = -3701242753493062181L;
	
	private String status;
	private int count;
	private ArrayList<Member> list;
	
	public ArrayList<Member> getList() {
		return list;
	}
	public void setList(ArrayList<Member> list) {
		this.list = list;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
