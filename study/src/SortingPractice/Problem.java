package SortingPractice;

import java.util.*;

public class Problem implements Comparable<Problem> {

	public static final Comparator<Problem> WITH_SUBJECT = new WITHSUBJECT();
	public static final Comparator<Problem> WITH_DIFFICULTY = new WITHDIFFICULTY();
	
	public int id;
	public int difficulty;
	public String subject;

	public Problem(int id, int difficulty, String subject) {
		this.id = id;
		this.difficulty = difficulty;
		this.subject = subject;
	}

	@Override
	public int compareTo(Problem a) {
		return this.id - a.id;
	}

	public static class WITHSUBJECT implements Comparator<Problem> {
		@Override
		public int compare(Problem a, Problem b) {
			return a.subject.compareTo(b.subject);
		}
	}

	public static class WITHDIFFICULTY implements Comparator<Problem> {
		@Override
		public int compare(Problem a, Problem b) {
			return a.difficulty - b.difficulty;
		}
	}

}
