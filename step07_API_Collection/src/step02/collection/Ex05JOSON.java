package step02.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import model.domain.Student;

public class Ex05JOSON {
	public static void main(String[] args) {
		// JSON Object
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Java");
		jsonObject.put("age", 27);

		System.out.println(jsonObject);

		// HashMap으로 JSONObject 생성
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Java");
		map.put("age", "27");
		System.out.println(map); // JSON아님! map이다
		JSONObject jsonObject2 = new JSONObject(map);
		System.out.println(jsonObject2);

		// JSON 문자열로 JSONObject 생성
		JSONObject jsonObject3 = new JSONObject("{\"name\":\"Java\",\"age\":\"27\"}");
		System.out.println(jsonObject3);

		// POJO로 JSONObject 생성
		Student student1 = new Student("Java", 1, "Junior");
		JSONObject jsonObject4 = new JSONObject(student1);
		System.out.println(jsonObject4.get("name")); // 단순 문자열 아님! 객체이다

		// List로 JSONObject 생성
		List<String> friendList = new ArrayList<String>();
		friendList.add("Sam");
		friendList.add("Harry");

		JSONArray jsonFriendList = new JSONArray(friendList); // Array도 하나의 객체
		System.out.println(friendList);
		System.out.println(jsonFriendList);

		JSONObject jsonObject5 = new JSONObject();
		jsonObject5.put("name", "Java");
		jsonObject5.put("age", "27");
		jsonObject5.put("friends", jsonFriendList);

		System.out.println(jsonObject5);

	}
}
