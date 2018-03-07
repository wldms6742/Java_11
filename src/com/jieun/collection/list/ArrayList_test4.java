package com.iu.collection.list;

import java.util.ArrayList;

public class ArrayList_test4 {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("iu");
		student.setNum(1);
		ArrayList<Student> ar = new ArrayList<>();
		ArrayList<Student> ar2 = new ArrayList<>();
		ar.add(student);
		
		student = new Student();
		ar.add(student);
		
		ar.get(1).setName("choa");
		
		student.setName("suji");
		
		System.out.println(ar.get(1).getName());
		
		ArrayList<ArrayList<Student>> ar3 = new ArrayList<>();
		ar3.add(ar);
		ar3.add(ar2);
		
		ar3.get(0).get(0).getName();
		
		
		ArrayList<ArrayList<ArrayList<Student>>> ar4 = new ArrayList<>();
		
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).getName());
		}
		
		for(Student student2:ar) {
			System.out.println(student2.getName());
		}
		

	}

}
