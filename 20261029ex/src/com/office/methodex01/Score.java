package com.office.methodex01;

public class Score {

	// 메서드
	/*
	 * 요구사항 -I: 학급 학생(3명)의 총점과 평균을 출력하는 메서드 만들자.
	 */
	/*
	public void printStudenScore(int s1, int s2, int s3, int s4) {
		
		int totalScore = s1 + s2 + s3 + s4;
		double averageScore = totalScore / 4;
		
		System.out.println("Total: " + totalScore);
		System.out.println("Average: " + averageScore);
	}
	*/
	
	public void printStudenScore(int...scores) {
		
		int totalScore = 0;
		for (int score : scores) {
			totalScore += score;
		}
		
		double averageScore = totalScore / scores.length;
		
		System.out.println("Total: " + totalScore);
		System.out.println("Average: " + averageScore);
	}
	
	// 가변인자는 무조건 파라미터 마지막에 와야 한다.
	// 가변인자는 배열이다.
	// 오버로딩과 가변인자는 같이 사용 가능하다.	
	
	public void ptintTotalScore(int...scores) {
		
	}
	public void ptintTotalScore(String className, int...scores) {
		
	}
	
	/*
	 * 요구사항-II
	 */
	
	
	
}
