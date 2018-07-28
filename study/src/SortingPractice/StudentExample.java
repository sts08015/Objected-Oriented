package SortingPractice;

import java.util.*;

public class StudentExample {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student(111,"fisma","computer",100));
		student.add(new Student(112,"dongkyun","physics",80));
		student.add(new Student(113,"lim","math",65));
		student.add(new Student(114,"im123","chemistry",70));
		
		Collections.sort(student);
		for(Student i : student) {
			System.out.println(i.getName());
		}
		System.out.println("--------------");
		
		Collections.sort(student, Student.WITH_DEPT);
		for(Student i : student) {
			System.out.println(i.getName());
		}
	}

}
