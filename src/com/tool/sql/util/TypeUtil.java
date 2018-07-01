package com.tool.sql.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.tool.sql.bean.java.JavaEntityBean;
import com.tool.sql.bean.sql.SqlTableBean;
import com.tool.sql.map.Constant;

public class TypeUtil {
	public static final String ENTITY = "Entity";
	public static JavaEntityBean sqlConvToJava(SqlTableBean sqlBean,String packageName) {
		String name = toJavaEntityName(sqlBean.getName());
		
		return null;
	}

	public static String toJavaString(String name) {
		StringBuilder sb = new StringBuilder();
		List<String> arrays = splitByUnderLineAndEmpty(name);
		String convValue = extractJavaTypeName(arrays);
		sb.append(convValue);
		return sb.toString();
	}

	protected static List<String> splitByUnderLineAndEmpty(String name) {
		List<String> resultArrays = new ArrayList<>();
		String[] arrays = name.split(Constant.UNDER_LINE);
		for (int i = 0; i < arrays.length; i++) {
			String[] arr = arrays[i].split(Constant.EMPTY);
			resultArrays.addAll(Arrays.asList(arr));
		}
		return resultArrays;
	}

	public static String toJavaEntityName(String tableName) {
		StringBuilder sb = new StringBuilder();
		if (isAllUpperAndNoneEmptyOrUnderLine(tableName)) {
			sb.append(toFirstUppder(tableName.toLowerCase())).append(ENTITY);
			return sb.toString();
		}
		sb.append(toJavaString(tableName)).append(ENTITY);
		return sb.toString();
	}

	protected static boolean isAllUpperAndNoneEmptyOrUnderLine(String tableName) {
		return StringUtils.isAllUpperCase(tableName)&&(tableName.indexOf(Constant.UNDER_LINE)<-1 || tableName.indexOf(Constant.EMPTY)<-1);
	}
	protected static String extractJavaTypeName(List<String> arrays) {
		if (arrays.isEmpty()) {
			return StringUtils.EMPTY;
		}
		if (arrays.size() == 1) {
			return toFirstUppder(arrays.get(0));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arrays.size(); i++) {
			String str = arrays.get(i).toLowerCase();
			sb.append(toFirstUppder(str));
		}
		return sb.toString();
	}

	public static boolean isEmpty(String[] arrays) {
		return arrays==null|| arrays.length==0;
	}

	public static String toFirstUppder(String value) {
		StringBuilder sb = new StringBuilder();
		String firstValue = value.substring(0, 1).toUpperCase();
		sb.append(firstValue);
		sb.append(value.substring(1));
		return sb.toString();
	}
	public static String toFirstLower(String value) {
		StringBuilder sb = new StringBuilder();
		String firstValue = value.substring(0, 1).toLowerCase();
		sb.append(firstValue);
		sb.append(value.substring(1));
		return sb.toString();
	}
	public static void main(String[] args) {
		
	}
}
