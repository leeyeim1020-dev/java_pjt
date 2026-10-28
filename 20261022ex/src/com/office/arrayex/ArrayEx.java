package com.office.arrayex;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		/*
		 * 배열 선언
		 */
		
		/*
		 * 1. 데이터타입[] 배열 변수명 = {...};
		 */
		//int[] numbers1 = {1, 2, 3, 4, 5};
		
		/*
		 * 2. 데이터타입[] 배열 변수명 = new 데이터타입[배열의길이];
		 */
		
		int[] numbers2 = new int[5];
		
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		numbers2[4] = 5;
		
		/*
		 * 3. 데이터타입[] 배열 변수명 = new 데이터타입[]{...};
		 */
		
		//int[] numbers3 = new int[] {1, 2, 3, 4, 5};
		
		/*
		 * 배열 데이터 조뢰: 인덱스를 이용한 데이터 조회
		 */
		
		int[] scores = {80, 90, 100, 75, 60};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]: %d\n", i, scores[i]);
		}
		/*
		 * 배열 데이터 수정: 인덱스를 이용한 데이터 수정
		 */
		int[] points = {80, 90, 100, 60, 90};
		
		for (int i = 0; i < points.length; i++) {
			System.out.printf("points[%d]: %d\n", i, points[i]);
		}
		
		// foreach
		
		for (int point : points) {
			System.out.println("point: " + point);
		}
		
		points[0] = 800;
		System.out.println("points[0]: " + points[0]);
		
		/*
		 * java의 배열 특징
		 * 1. 배열은 단일 데이터 타입만 저장 가능하다.
		 * let nums = [10, 20, 'hello']; (javascript) 가능
		 * 2. 최초 선언된 배열의 길이는 변경 불가하다.
		 * 3. 존재하지 않는 인덱스를 이용하게 되면 에러 발생한다.
		 */
		
		//int[] ns = {1, 2, 3};
		
		//System.out.println("ns[3]: " + ns[3]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//at com.office.arrayex.ArrayEx.main(ArrayEx.java:70)
		
		// 에러를 대비해 예외처리 해줘야함 
		
		//ns = new int[5];
		
		// 아예 새로운 주소가 생김
		
		/*
		 *  배열을 이용해서 학급 학생의 시험 성적, 총점, 평균을 출력하자
		 */
		
		int[] studentScores = {80, 95, 100, 70, 68, 74, 88, 98, 100, 76};
		int total = 0;
		float average = 0.0f;
		
		for(int i = 0; i < studentScores.length; i++) {
			System.out.printf("studentScores[%d] score: %d\n", i, studentScores[i]);
			total += studentScores[i];
		}
		
		System.out.println("total score: " + total);
		
		average = total / studentScores.length;
		System.out.println("Average: " + average);
		
		int[] calsses = new int[5];
		
		for(int i = 0; i < calsses.length; i++) {
			System.out.println(calsses[i]);
		}
		
		float[] averagees = new float[5];
		for(int i = 0; i < averagees.length; i++) {
			System.out.println(averagees[i]);
		}
		
		/*
		 *  배열 복사
		 */
		
		int number1 = 10;
		int number2 = 20;
		
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
		
		number2 = number1;
		
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
		
		number1 = 100;
		
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
		
		int[] numbers = {1, 2, 3};
		
		int[] numbersCopy = numbers;
				
		System.out.println("numbers: " + numbers);
		System.out.println("numbersCopy: " + numbersCopy);		
		
		 for(int i = 0; i < numbers.length; i++) {
			 System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
		 }
		 
		 for(int i = 0; i < numbersCopy.length; i++) {
			 System.out.printf("numbersCopy[%d]: %d\n", i, numbersCopy[i]);
		 }
		 
		 numbers[0] = 100;
		 System.out.println(numbersCopy[0]);
		 
		 // 배열을 복사하면 주소값을 가져오기 때문에 한쪽의 주소를 가져오면 두곳 다 값이 변경된다
		 
		 // 깊은 복사
		 // int[] numbers = {1, 2, 3}; ---> int[] numbersDeepCopy
		 // for문 사용도 좋지만 데이터가 많아지면 퍼포먼스가 떨어짐 
		 int[] numbersDeepCopy = new int [numbers.length];
		 
		 for(int i = 0; i < numbers.length; i++) {
			 numbersDeepCopy[i] = numbers[i];
		 }
		
		 for(int i = 0; i < numbersDeepCopy.length; i++) {
			 System.out.printf("numbersDeepCopy[%d]: %d\n", i, numbersDeepCopy[i]);
		 }
		 
		 for(int i = 0; i < numbers.length; i++) {
			 System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
		 }
		 
		 numbersDeepCopy[2] = 3000;
		 
		 System.out.println(numbers[2]);
		 System.out.println(numbersDeepCopy[2]);
		 
		 // 배열 삭제
		 int[] mySocres = {80, 90, 100};
		 System.out.println("mySocres: " + mySocres);
		 
		 mySocres = null;
		 
		 System.out.println("mySocres: " + mySocres);
		 // 2차원 배열 선언 및 생성
		 // 다차원 배열에서 가장 많이 사용하는 2차원 배열은 배열안에 또 다른 배열을 가리키는 배열 주솟값이 들어있는 형태이다
		 // 여러차원 배열을 사용할순 있지만 계산이 어려워지고 가독성이 떨어져 2차원 까지만 사용하는게 좋다
		 
		 // int[][] mns = new num[3][2];
		 
		 //int[][] mms = new int[3][2];
		 //System.out.println("mms: " + mms); // [[I@36d64342 
		 
		 /*
		  * int[] mns == int num[2];
		  * int[][] mns == int num[3][2];
		  */
		 
		 //int[][] mns = {{1,2}, {10,20}, {100,200}};
		 /*
		 int[][] mns = new int[3][2];
		 mns[0][0] = 1;
		 mns[0][1] = 2;
		 mns[1][0] = 10;
		 mns[1][1] = 20;
		 mns[2][0] = 100;
		 mns[2][1] = 200;
		 */
		 int[][] mns = new int[][] {{1, 2}, {10, 20}, {100, 200}};
		 
		 
		 // 데이터 조회
		 System.out.println(mns[0]); // [I@36d64342 2차원 배열의 주소
		 System.out.println(mns[0][0]); // 1 2차원 배열의 값
		 //그냥 배열과 마찬가지로 없는 방을 지목하면 에러가 난다
		 
		 mns[0][0] = 1000;
		 System.out.println(mns[0][0]); // 1000 
		 
		 
		 
		 
	}

}
