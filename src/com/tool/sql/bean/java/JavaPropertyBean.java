package com.tool.sql.bean.java;

public class JavaPropertyBean {
	private String name;
	private JavaType type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JavaType getType() {
		return type;
	}
	public void setType(JavaType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "JavaPropertyBean [name=" + name + ", type=" + type + "]";
	}
	
}
