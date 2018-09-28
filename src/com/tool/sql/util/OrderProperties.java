package com.citigroup.cmot.jcdw.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.citigroup.cmot.jcdw.common.cons.Constants;

public class OrderProperties {
	private static Logger logger = LoggerFactory.getLogger(OrderProperties.class);
	private Map<String, List<String>> keyLists = new HashMap<>();
	private List<Map<String, String>> listMaps = new ArrayList<>();
	private BufferedReader reader;

	public List<String> readLines() {
		String line = "";
		List<String> lines = new ArrayList<>();
		try {
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			logger.error(Constants.IO_EXCEPTION, e);
		}
		return lines;
	}

	public OrderProperties(String path) {
		try (InputStream inputStream = Thread.currentThread().getClass().getResourceAsStream(path);) {
			this.reader = new BufferedReader(new InputStreamReader(inputStream));
			generate2KeyLists(readLines());
			generate2ListMaps(readLines());
		} catch (IOException e) {
			logger.error(Constants.IO_EXCEPTION, e);
		}

	}

	public void generate2KeyLists(List<String> lines) {
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			if ("".equals(line)) {
				continue;
			}
			String[] keyValue = lines.get(i).split("=", 2);
			String key = keyValue[0];
			String value = keyValue[1];
			if (this.keyLists.containsKey(key)) {
				this.keyLists.get(key).add(value);
			} else {
				this.keyLists.put(key, new ArrayList<String>());
				this.keyLists.get(key).add(value);
			}
		}
	}

	public void generate2ListMaps(List<String> lines) {
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			if ("".equals(line)) {
				this.listMaps.add(new HashMap<String, String>());
			}
			String[] keyValue = lines.get(i).split("=", 2);
			String key = keyValue[0];
			String value = keyValue[1];
			this.listMaps.get(i).put(key, value);
		}
	}

	public Map<String, List<String>> getKeyLists() {
		return this.keyLists;
	}

	public List<String> getKeyListsKey(String key) {
		return this.keyLists.get(key);
	}

	public List<Map<String, String>> getListMaps() {
		return this.listMaps;
	}

	public Map<String, String> getListMapsIndex(int i) {
		return this.listMaps.get(i);
	}

}
