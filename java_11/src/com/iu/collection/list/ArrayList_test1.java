package com.iu.collection.list;

import java.util.ArrayList;

public class ArrayList_test1 {

	public static void main(String[] args) {
		//List interface -> ArrayList
		//ArrayList => 배열 기반
		ArrayList ar = new ArrayList();
		//추가
		ar.add("first");
		ar.add(2);
		ar.add('3');
		ar.add(true);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ar.set(1, 3.2);
		System.out.println("===========");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ar.add(1, 100);
		System.out.println("===========");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ar.remove(1);
		System.out.println("===========");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
		

	}

}
