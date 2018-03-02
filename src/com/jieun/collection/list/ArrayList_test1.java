package com.jieun.collection.list;

import java.util.ArrayList;

public class ArrayList_test1 {

	public static void main(String[] args) {
	//List_interface -> Arraylist
	//ArrayList = 배열기반
		ArrayList ar = new ArrayList();
	//추가
		ar.add("first");
		ar.add(2);
		ar.add('3');
		ar.add(true);
		
		for(int i =0;i<ar.size();i++) {
			//length대신 size사용
			System.out.println(ar.get(i));
		}
		ar.set(1,3.2);//1번인덱스의 값 변경(수정)
		System.out.println("===========");
		for(int i =0;i<ar.size();i++) {
			//length대신 size사용
			System.out.println(ar.get(i));
		}
		
		ar.add(1, 100);//배열의 중간에 삽입 , 인덱스번호 없는경우는 맨뒤에 붙고 인덱스번호있으면
		//해당인덱스에 삽입하고 나머지 값들은 밀려남
		System.out.println("===========");
		for(int i =0;i<ar.size();i++) {
			//length대신 size사용
			System.out.println(ar.get(i));
		}
		ar.remove(1);//1번인덱스의 값을 삭제
		System.out.println("===========");
		for(int i =0;i<ar.size();i++) {
			//length대신 size사용
			System.out.println(ar.get(i));
		}
		
		
}
}
