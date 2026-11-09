package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {

	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;

	if (IS_DEV)
		new MemberDumy().signUpForDumy(memberService);
	
	String memId;
	String memPw;
	String memMail;
	String memPhone;
	MemberDto memberDto;
	
	
	while (systemFlag) {
		
		System.out.println("1.SIGN-UP   2.SIGN-IN   3.MODIFY  4.DELETE   99.SYSTEM-OUT");
		int selectedMenu = scanner.nextInt();
		
		if (memPw.length() >= 4) {
			System.out.println("Input new member PW");
			memPw = scanner.next();
			
		} else {
			break;
		
		switch (selectedMenu) {
		case SIGN_UP:
			
			System.out.println("Input new member ID!!");
			memId = scanner.next();
			
			System.out.println("Input new member PW!!");
			memPw = scanner.next();
			
			System.out.println("Input new member MAIL!!");
			memMail = scanner.next();
			
			System.out.println("Input new member Phone!!");
			memPhone = scanner.next();
			
			memberDto = new MemberDto(memId, memPw, memMail, memPhone);
			
			
			break;

		case SIGN_IN:
			
			System.out.println("Input member ID!!");
			memId = scanner.next();
			
			System.out.println("Input member PW!!");
			memPw = scanner.next();
			
			break;
			
		case MODIFY:
			
			System.out.println("Input new member ID!!");
			memId = scanner.next();
			
			System.out.println("Input new member PW!!");
			memPw = scanner.next();
			
			break;
			
		case DELETE:
			
			System.out.println("Input new member ID!!");
			memId = scanner.next();
			
			System.out.println("Input new member PW!!");
			memPw = scanner.next();
			
			memberDto = new MemberDto(memId, memPw, null);

			break;
				
		case MENU_SYSTEM_OUT:
			systemFlag = false;
			System.out.println("good bye~");
			break;
		}
	
	}
	
	scanner.close();
	
	
}
	
		
}
