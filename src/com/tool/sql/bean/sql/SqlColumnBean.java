package com.tool.sql.bean.sql;

public class SqlColumnBean {
	private String name;
	private SqlType type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SqlType getType() {
		return type;
	}
	public void setType(SqlType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "SqlColumnBean [name=" + name + ", type=" + type.toString() + "]";
	}
	
}
