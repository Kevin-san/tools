package com.tool.sql.bean.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tool.sql.bean.sql.SqlTableBean;

public class JavaEntityBean {
	private String name;
	private String packageName;
	private Set<String> importClasses = new HashSet<>();
	private List<JavaPropertyBean> properties = new ArrayList<>();
	public JavaEntityBean(SqlTableBean sqlBean,String name,String packageName) {
		this.name = name;
		this.packageName = packageName;
		
	}
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
	
	public Set<String> getImportClasses() {
		return importClasses;
	}
	public void setImportClasses(Set<String> importClasses) {
		this.importClasses = importClasses;
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
