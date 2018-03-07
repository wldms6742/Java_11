package com.iu.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_test1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		Iterator<Integer> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
