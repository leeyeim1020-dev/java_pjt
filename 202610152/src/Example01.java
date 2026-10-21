
public class Example01 {
	public static void main(String[] args) {
		final int SPEED = 20;
		int count = 10;
//		SPEED = 40;    상수는 값을 변경할 수 없어 오류가 발생됨
		count = 11;
		System.out.print("상수 SPEED 값은 ");
		System.out.println(SPEED);
		System.out.print("변수 count 값은 ");
		System.out.println(count);
	}

}
