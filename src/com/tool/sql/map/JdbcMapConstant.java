package com.tool.sql.map;

import java.util.HashMap;
import java.util.Map;

public class JdbcMapConstant {
	private static final String TIMESTAMP = "Timestamp";
	private static final String TIME = "Time";
	private static final String DATE = "Date";
	private static final String BYTE_ARR = "Byte[]";
	private static final String FLOAT = "Float";
	private static final String LONG = "Long";
	private static final String SHORT = "Short";
	private static final String BYTE = "Byte";
	private static final String BOOLEAN = "Boolean";
	private static final String BIG_DECIMAL = "BigDecimal";
	private static final String INTEGER = "Integer";
	private static final String DOUBLE = "Double";
	private static final String STRING = "String";
	public static final Map<String,String> CLASS_MAP = new HashMap<>();
	public static final Map<String,String> MYSQL_MAP = new HashMap<>();
	public static final Map<String,String> ORACLE_MAP = new HashMap<>();
	public static final Map<String,String> SQLSERVER_MAP = new HashMap<>();
	public static final Map<String,String> SYBASE_MAP = new HashMap<>();
	public static final Map<String,String> DB2_MAP = new HashMap<>();
	static {
		CLASS_MAP.put(STRING, null);
		CLASS_MAP.put(DOUBLE, null);
		CLASS_MAP.put(INTEGER, null);
		CLASS_MAP.put(BIG_DECIMAL, "java.math.BigDecimal");
		CLASS_MAP.put(BOOLEAN, null);
		CLASS_MAP.put(BYTE, null);
		CLASS_MAP.put(SHORT, null);
		CLASS_MAP.put(LONG, null);
		CLASS_MAP.put(FLOAT, null);
		CLASS_MAP.put(BYTE_ARR, null);
		CLASS_MAP.put(DATE, "java.sql.Date");
		CLASS_MAP.put(TIME, "java.sql.Time");
		CLASS_MAP.put(TIMESTAMP, "java.sql.Timestamp");
		
		MYSQL_MAP.put("", "");
		ORACLE_MAP.put("number", LONG);
		ORACLE_MAP.put("raw", BYTE_ARR);
		ORACLE_MAP.put("bit", BOOLEAN);
		ORACLE_MAP.put("blob", BYTE_ARR);
		ORACLE_MAP.put("char", STRING);
		ORACLE_MAP.put("varchar2", STRING);
		ORACLE_MAP.put("nchar", STRING);
		ORACLE_MAP.put("nvarchar2", STRING);
		ORACLE_MAP.put("clob", STRING);
		ORACLE_MAP.put("date", DATE);
		ORACLE_MAP.put("number(p,s)", BIG_DECIMAL);
		ORACLE_MAP.put("number", LONG);
	}
}
