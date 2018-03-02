package com.jieun.collection.list;

import java.util.ArrayList;

public class ArrayList_test2 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add("first");
		ar.add(2);
		ar.add(3.2);
		
		String str = (String)(ar.get(0));
		//ar.add에는 object타입으로 들어감
		//따라서 나올때도 object타입 ->형변환필요하다
		int num = (Integer)(ar.get(1));
		double d = (Double)(ar.get(2));
		
		ArrayList<String> ar2 = new ArrayList<>();//이제 ar2에는 String 타입만 담겠다는 뜻
		ArrayList<Integer> ar3 = new ArrayList<>();//정수타입만을 담겠다는 뜻
		
		ar2.add("first");
		String s = ar2.get(0); //String타입만을 담기로 했기때문에 형변환이 필요없음
		
	}

}
