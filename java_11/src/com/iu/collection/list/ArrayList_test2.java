package com.iu.collection.list;

import java.util.ArrayList;

public class ArrayList_test2 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add("first");
		ar.add(new Integer(2));
		ar.add(3.2);
		
		String str = (String)ar.get(0);
		int num = (Integer)ar.get(1);
		double du = (Double)ar.get(2);
		
		ArrayList<String> ar2 = new ArrayList<>();
		ArrayList<Integer> ar3 = new ArrayList<>();
		
		ar2.add("first");
		
		String s = ar2.get(0);
		
		
		

	}

}
