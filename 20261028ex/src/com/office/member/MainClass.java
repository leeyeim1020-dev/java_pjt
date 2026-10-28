package com.office.member;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		boolean isDevelopment = true;   //false이면 더미데이터 등록x, true이면 더미데이터 3명 등록o 
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		
		if (isDevelopment) {
		    MemberDumy memberDumy = new MemberDumy(memberDB);
		    memberDumy.initMemberDumyData();
		}
		/*
		 *과제1: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다. 
		 */
		
		while (systemFlag) {
		
			final int SIGN_UP = 1;
			final int SIGN_IN = 2;
			final int MODIFY = 3;
			final int DELETE = 4;
			final int PRINT_ALL_MEMBERS = 5;
			final int SYSTEM_OUT = 99;
			
			
			
			System.out.println("1.SIGN-UP   2.SIGN-IN   3.MODIFY  4.DELETE  5.PRINT-ALL-MEMBERS  99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
		
			switch (selectedMenu) {
			case SIGN_UP:				// SIGN-UP
				// memberSevice = new MemberSevice();
				memberService.doSignUp(scanner);
				
				break;
				
			case SIGN_IN:				// SIGN-IN
				// memberSevice = new MemberSevice();
				memberService.doSignIn(scanner);
				
				break;
				
			case MODIFY:				// MODIFY
				memberService.doModify(scanner);
				
				break;
				
			case DELETE:				// DELETE
				memberService.doDelete(scanner);
				
				break;
				
			case PRINT_ALL_MEMBERS:				
				memberService.doPrintAllMembers();
				break;

			case SYSTEM_OUT:				// SYSTEM-OUT
				systemFlag = false;
				System.out.println("Say Good bye~");
				break;
				
				/*
				 * 과제2: case에 사용되는 리터럴 상수 -> 상수 변경 O
				 * 과제3: 메뉴 5번을 만들어서 전체 회원 정보 출력하는 기능을 구현(AI도움) O
				 */

			}
			
		}
		
		scanner.close();
	}

}
	
