package com.open.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthSpinnerUI;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.open.bean.Student;

/**
 * @className: JsonDemo
 * @author： Tang
 * @createTime 2017年11月2日 下午4:47:27
 **/
public class JsonDemo {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("zhangsan");
		student.setAge(20);
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		String jsonString2 = JSONObject.toJSONString(list);
		System.out.println(jsonString2);
		//JsonString->List
		List<Student> parseArray = JSONObject.parseArray(jsonString2,Student.class);
		System.out.println(parseArray);
		//object->Json
		Object json = JSONObject.toJSON(student);
		String string2 = json.toString();
		//object->JsonString
		String jsonString = JSONObject.toJSONString(student);
		System.out.println(json);
		System.out.println(jsonString);
		//jsonString->object
		Student student1 = JSONObject.parseObject(jsonString, Student.class);
		System.out.println(student1);
		//jsonString->JSON
		JSONObject parseObject = JSONObject.parseObject(jsonString);
		//JSON获取对应key的值
		String string = parseObject.getString("name");
		System.out.println(string);
//		JSONObject.parseObject(text, clazz);
		Student javaObject = JSONObject.toJavaObject(parseObject, Student.class);
		System.out.println(javaObject);
		String str = "{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}";  
		System.out.println(str);
		//string->MAP
		Map mapTypes = JSONObject.parseObject(str);
		System.out.println(mapTypes.get("0"));
		
		
	}
}
