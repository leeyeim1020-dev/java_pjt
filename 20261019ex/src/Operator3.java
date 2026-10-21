
public class Operator3 {
	
	public static void main(String[] args) {
		
		/*
		 * 비교 연산자
		 * 크고 작음을 나타내는 연산자 입니다.
		 */
		
		System.out.println(10 < 20);  //true
		System.out.println(10 > 20);  //false
		
		System.out.println(10 <= 20);  //true
		System.out.println(10 >= 20);  //false
		
		System.out.println(10 == 20);  //false
		System.out.println(10 != 20);  //true
		
//		System.out.println(10 === 20);  //false     자바스크립트에만 있음
//		System.out.println(10 !== 20);  //false     자바스크립트에만 있음
		
		float num5 = 0.1f;    // 0.10000000149   > double
		double num6 = 0.1;    // 0.10000000000   > double
		
		System.out.println("num5: " + num5);   //0.1
		System.out.println("num6: " + num6);   //0.1
		System.out.println("num5 + num6: " + (num5 + num6));   //0.2
		
		System.out.println("num5 == num6: " + (num5 == num6));   // false
		System.out.println("num5 != num6: " + (num5 != num6));   // true
		
		System.out.println("num5 > num6: " + (num5 > num6));   // true
		System.out.println("num5 < num6: " + (num5 < num6));   // false
		
		int num7 = 10;
		float num8 = 10.0f;
		
		// int + float => float + float //   num7: 10.0  num8: 10.0
		
		System.out.println("num7 > num8: " + (num7 > num8));    //false  O 
		System.out.println("num7 >= num8: " + (num7 >= num8));  //false  X true
		System.out.println("num7 < num8: " + (num7 < num8));    //true   X false
		System.out.println("num7 <= num8: " + (num7 <= num8));  //true   O
		System.out.println("num7 == num8: " + (num7 == num8));  //false  X true
		System.out.println("num7 != num8: " + (num7 != num8));  //true   X false
		
		
		
		// ***************************************************************
		// 문자열 비교
		String str1 = "hello";
		String str2 = "hello";

		System.out.println("str1 == str2: " + (str1 == str2));  //true
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println("str3 == str4: " + (str3 == str4));
		
		System.out.println("str3 == str4: " + (str3.equals(str4)));
	}

}
