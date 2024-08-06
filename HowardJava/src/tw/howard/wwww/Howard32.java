package tw.howard.wwww;

import java.util.HashMap;
import java.util.Set;

public class Howard32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Howard");
		map.put("age", "30");
		map.put("gender", true);
		map.put("weight", 60);
		System.out.println(map.get("age"));
		System.out.println("==========");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.printf("%s => %s\n", key, map.get(key));
		}
	}

}
