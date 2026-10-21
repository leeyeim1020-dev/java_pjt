
public class Operator {
	public static void main(String[] args) {
		
		
		/*
		 * 연산자(Operator)
		 * 산술연산자, 대입(복합) 연산자, 비교 연산자, 논리연산자, 조건식연산자 등등...
		 */
		
	      /*
	       *  산술 연산자  :  +, -, *, /, %, ++, --
	          할당 연산자  :  =, +=, -=, *=, /=, %=, (비트연산자: &= , |=  웹에서는 잘 사용 안 함) 	   
	          비교 연산자  :  ==, !=, >, <, >=, <=
	          논리 연산자  :  &&, ||, !
	       */

		// 1. 덧셈 연산
		//1-1. 숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2: " + (num1 + num2));
		
		float num3 = 0.1f;
		float num4 = 0.2f;
		System.out.println("num3 + num4: " + (num3 + num4));
		
		// 1-2. 문자열 덧셈
		String str1 = "Hello ";
		String str2 = "world";
		System.out.println("str1 + str2: " + (str1 + str2));
		
		// 1-3. 숫자 + 문자열 = 문자열 + 문자열 = 문자열(열결연산자)
		System.out.println(10 + "Hello ");
		System.out.println(3.14f + "world");
		
		//참고: 문자 덧셈
		System.out.println('A' + 'B');    // 65 + 66 = 131 -> 유니코드화 돼서 출력
		System.out.println('가' + '나');   // 44032 + 45208 = 89240  -> 유니코드화 돼서 출력
		
		// 2. 뺄셈
		// 2-1. 숫자 뺄셈
		num1 = 10; num2 = 20;
		System.out.println("num1 - num2: " + (num1 - num2));
		
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 - num4: " + (num3 - num4));
		
		// 2-2. 문자열 뺄셈(X)
		str1 = "Hello "; str2 = "world";
//		System.out.println("str1 - str2: " + (str1 - str2));
		
		// 참고: 문자 뺄셈(o)
		System.out.println('A' - 'B');    //  -1     -> 유니코드화 돼서 출력
		System.out.println('가' - '나');   //  -1176  -> 유니코드화 돼서 출력
		
		// 3. 곱셈
		num1 = 10; num2 = 20;
		System.out.println("num1 * num2: " + (num1 * num2));
		
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 * num4: " + (num3 * num4));
		
		System.out.println('A' * 'B');    //  65 * 66 = 4290              -> 유니코드화 돼서 출력
		System.out.println('가' * '나');   //  44032 * 45208 = 1990598656  -> 유니코드화 돼서 출력		
		
		// 4. 나눗셈
		num1 = 10; num2 = 20;
		System.out.println("num1 / num2: " + (num1 / (float)num2));    // 0.5   
		
		num3 = 0.8f; num4 = 0.2f;
		System.out.println("num3 / num4: " + (num3 / num4));
		
		System.out.println((int)'a');    // 97
		System.out.println((int)'A');	 //	65
		System.out.println('a' / 'A');   // 97 / 65 => 1.492307692307692  프로그램은 1이라고 나옴

		System.out.println(0/100);  // 0, 모든 수가 0을 나눠도 0이 나옴
//		System.out.println(100/0);  // 에러, 모든 수를 0으로 나눌 수 없음
		
		// 5. 나머지 연산자
		num1 = 10; num2 = 3;
		System.out.println("num1 % num2: " + (num1 % num2));
		System.out.println('a' % 'A');  //32  -> 유니코드화 돼서 출력
		
	}


}
