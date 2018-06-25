package com.tool.sql.bean;

import java.util.ArrayList;
import java.util.List;

public class SqlTableBean {
	private String database;
	private String name;
	private List<SqlColumnBean> columns = new ArrayList<>();

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SqlColumnBean> getColumns() {
		return columns;
	}

	public void setColumns(List<SqlColumnBean> columns) {
		this.columns = columns;
	}

	@Override
	public String toString() {
		return "SqlTableBean [database=" + database + ", name=" + name + ", columns=" + columns + "]";
	}
	
}
