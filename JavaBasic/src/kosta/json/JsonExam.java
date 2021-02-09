package kosta.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExam {

	public static void main(String[] args) {
		// 객체 => JSON 문자열
		JsonExam e = new JsonExam();
		JSONObject obj = e.createJson();
		JSONObject obj2 = e.createJson2();
//		System.out.println(obj.toJSONString());
//		System.out.println(obj2.toJSONString());

		JSONArray ja = new JSONArray();
		ja.add(obj);
		ja.add(obj2);

		// JsonArray를 => json 문자열로
//		System.out.println(ja.toJSONString());

		// List<Member> => json 문자열로
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("홍길동", "가산동", 20));
		list.add(new Member("고길동", "강남", 40));

//		System.out.println(net.sf.json.JSONArray.fromObject(list).toString()); // JSONArray class가 두 개 import되어 있어서
																				// class 명이 표시된다

		
		
		
		// Json 문자열 => 객체
		String jsonCode = net.sf.json.JSONArray.fromObject(list).toString();

		JSONParser parser = new JSONParser();
		Object re = null;
		try {
			re = parser.parse(jsonCode);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		if (re instanceof JSONArray) {
			JSONArray array = (JSONArray) re;
			Iterator iter = array.iterator();
			List<Member> list2 = new ArrayList<Member>();
			while (iter.hasNext()) {
				JSONObject js = (JSONObject) iter.next();
				String name = (String) js.get("name");
				String address = (String) js.get("address");
				int age =  ((Long) js.get("age")).intValue();
				
				list2.add(new Member(name,address,age));
			}
			System.out.println(list2);
		}

	}

	public JSONObject createJson() {
		JSONObject js = new JSONObject();
		js.put("name", "홍길동");
		js.put("address", "가산동");
		js.put("age", 20);

		return js;
	}

	public JSONObject createJson2() {
		JSONObject js = new JSONObject();
		js.put("name", "고길동");
		js.put("address", "강남");
		js.put("age", 30);

		return js;
	}

}
