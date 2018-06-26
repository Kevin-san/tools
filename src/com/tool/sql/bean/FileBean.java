package com.tool.sql.bean;

import java.util.ArrayList;
import java.util.List;

public class FileBean {
	private String directory;
	private String name;
	private String end;
	private String splitStr="";
	private int beginRow;
	private List<Integer> indexs = new ArrayList<>();
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getSplitStr() {
		return splitStr;
	}
	public void setSplitStr(String splitStr) {
		this.splitStr = splitStr;
	}
	public int getBeginRow() {
		return beginRow;
	}
	public void setBeginRow(int beginRow) {
		this.beginRow = beginRow;
	}
	public List<Integer> getIndexs() {
		return indexs;
	}
	public void setIndexs(List<Integer> indexs) {
		this.indexs = indexs;
	}
	
}
