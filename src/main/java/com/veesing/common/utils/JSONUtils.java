package com.veesing.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


public class JSONUtils {

	public static String beanToJson(Object object, String dataFormatString) {
		if (object != null) {
			if (StringUtils.isEmpty(dataFormatString)) {
				return JSONObject.toJSONString(object);
			}
			return JSON.toJSONStringWithDateFormat(object, dataFormatString);
		} else {
			return null;
		}
	}


	public static String beanToJson(Object object) {
		if (object != null) {
			return JSON.toJSONString(object);
		} else {
			return null;
		}
	}


	public static String stringToJsonByFastjson(String key, String value) {
		if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value)) {
			return null;
		}
		Map<String, String> map = new HashMap<String, String>();
		map.put(key, value);
		return beanToJson(map, null);
	}


	public static Object jsonToBean(String json, Object clazz) {
		if (StringUtils.isEmpty(json) || clazz == null) {
			return null;
		}
		return JSON.parseObject(json, clazz.getClass());
	}


	public static Map jsonToMap(String json) {
		if (StringUtils.isEmpty(json)) {
			return null;
		}
		return JSON.parseObject(json, Map.class);
	}


	public static Object mergejsonobjectignorekeyconflict(JSONObject o1, JSONObject o2){
		if(o1==null||o1.isEmpty()){
			return o2;
		}
		if(o2==null||o2.isEmpty()){
			return o1;
		}
		Set<String> keys=o2.keySet();
		for (String key : keys) {
			o1.put(key, o2.get(key));
		}
		return o1;
	}

}
