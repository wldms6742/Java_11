package com.jieun.collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class Map_test1 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("f1", "iu");
		map.put("f2", "choa");
		
		System.out.println(map.get("f1"));
		
		map.put("f1", "suji");//수정
		map.put("name", "suji");
		
		System.out.println(map.size());
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(map.get(key));
		}
		
		
		
		

	}

}
