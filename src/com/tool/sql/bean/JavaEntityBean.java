package com.tool.sql.bean;

import java.util.ArrayList;
import java.util.List;

public class JavaEntityBean {
	private String name;
	private String packageName;
	private List<JavaPropertyBean> properties = new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public List<JavaPropertyBean> getProperties() {
		return properties;
	}
	public void setProperties(List<JavaPropertyBean> properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "JavaEntityBean [name=" + name + ", packageName=" + packageName + ", properties=" + properties + "]";
	}
	
}
