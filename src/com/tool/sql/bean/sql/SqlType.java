package com.tool.sql.bean.sql;

public class SqlType {
	private String typeName;
	private Integer totalLength;
	private Integer integerSize;
	private Integer decimalSize;

	public SqlType(String typeName, int totalLength, int integerSize, int decimalSize) {
		this.typeName = typeName;
		this.totalLength = totalLength;
		this.integerSize = integerSize;
		this.decimalSize = decimalSize;
	}
	
	public SqlType(String typeName,int totalLength) {
		this.typeName = typeName;
		this.totalLength = totalLength;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getTotalLength() {
		return totalLength;
	}

	public void setTotalLength(Integer totalLength) {
		this.totalLength = totalLength;
	}

	public Integer getIntegerSize() {
		return integerSize;
	}

	public void setIntegerSize(Integer integerSize) {
		this.integerSize = integerSize;
	}

	public Integer getDecimalSize() {
		return decimalSize;
	}

	public void setDecimalSize(Integer decimalSize) {
		this.decimalSize = decimalSize;
	}

	@Override
	public String toString() {
		return "SqlType [typeName=" + typeName + ", totalLength=" + totalLength + ", integerSize=" + integerSize
				+ ", decimalSize=" + decimalSize + "]";
	}

}
