package utils;

import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	private static HashMap<String, String> map=new HashMap<String, String>();
	
	public static String name() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return("John"+generatedString);
	}
	
	public static String salary() {
		String generatedString=RandomStringUtils.randomNumeric(3);
		return("500"+generatedString);
	}
	
	public static String age() {
		String generatedString=RandomStringUtils.randomNumeric(3);
		return("20"+generatedString);
	}
	
	public static HashMap<String, String> setJson() {
		map.put("name",name());
		map.put("salary",salary());
		map.put("age",age());
		map.put("limit", "5");
		return map;
	}
	
	
}
