package SortingPractice;

import java.util.*;

public class Student implements Comparable<Student> {

	public static final Comparator<Student> WITH_NAME = new WithName();
	public static final Comparator<Student> WITH_DEPT = new WithDept();
	public static final Comparator<Student> WITH_Grade = new WithGrade();

	private String name;
	private int ID;
	private String dept;
	private int grade;

	public Student(int ID, String name, String dept, int grade) {
		this.ID = ID;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public String getDept() {
		return dept;
	}

	public int getGrade() {
		return grade;
	}

	public static class WithName implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}

	public static class WithDept implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			return s1.dept.compareTo(s2.dept);
		}
	}

	public static class WithGrade implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			return s1.grade - s2.grade;
		}
	}

	@Override
	public int compareTo(Student s1) {
		return this.ID - s1.ID;
	}
}
