package com.tool.sql.bean.sql;

public class SqlTypeMapBean {
	private SqlType sqlType;
	private String jdbcType;
	private String ibaitsType;
	private String hsqlType;
	private String javaType;
	public SqlType getSqlType() {
		return sqlType;
	}
	public void setSqlType(SqlType sqlType) {
		this.sqlType = sqlType;
	}
	public String getJdbcType() {
		return jdbcType;
	}
	public void setJdbcType(String jdbcType) {
		this.jdbcType = jdbcType;
	}
	public String getIbaitsType() {
		return ibaitsType;
	}
	public void setIbaitsType(String ibaitsType) {
		this.ibaitsType = ibaitsType;
	}
	public String getHsqlType() {
		return hsqlType;
	}
	public void setHsqlType(String hsqlType) {
		this.hsqlType = hsqlType;
	}
	public String getJavaType() {
		return javaType;
	}
	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}
	
}
