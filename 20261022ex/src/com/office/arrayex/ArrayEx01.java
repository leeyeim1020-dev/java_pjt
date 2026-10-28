package com.office.arrayex;

public class ArrayEx01 {
	
	public static void main(String[] args) {
		
		//2차원 배열 생성
		int[][] scores = {
				{85, 90, 90},
				{90, 80, 85},
				{90, 90, 100},
				{95, 85, 100}
		};
		
		//for문을 이용한 데이터 조회
		for (int i =0; i < scores.length; i++) {
			
			int[] temp = scores[i];
			for (int j = 0; j < temp.length; j++) {
				
				String str = "";
				switch (j) {
				case 0:
					str = "국어";
					break;
				case 1:
					str = "영어";
					break;
				case 2:
					str = "수학";
					break;
				}
				
				System.out.printf("%d학기 %s 점수: %d\n", (i+1), str, temp[j]);
				
			}
			
		}
		
	}

}
