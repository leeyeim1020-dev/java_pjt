package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {	
		
	
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService();
		
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP   2.SIGN-IN   3.MODIYF   4.DELTE   99.SYSTEM-OUT");
			int selsctedMenuNum = scanner.nextInt();
			
			switch (selsctedMenuNum) {
			case SIGN_UP: 
				memberService.signUp(scanner);
				break;
				
			case SIGN_IN: 
				memberService.signIn(scanner);
				break;
				
			case MODIYF: 
				memberService.modify(scanner);
				break;
				
			case DELTE: 
				memberService.delete(scanner);
				break;	
				
			case SYSTEM_OUT: 
				systemFlag = false;
				System.out.println("good bye~");
				break;
				
			
			}
		}
		
	}
	
}
