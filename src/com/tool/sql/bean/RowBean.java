package com.tool.sql.bean;

import java.util.ArrayList;
import java.util.List;

public class RowBean {
	private int length;
	private List<String> rows = new ArrayList<>();
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public List<String> getRows() {
		return rows;
	}
	public void setRows(List<String> rows) {
		this.rows = rows;
	}
	
	
}
