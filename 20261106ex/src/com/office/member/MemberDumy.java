package com.office.member;

public class MemberDumy {
 
	private String[] memIds = {"gildong", "chanho"};
	private String[] memPws = {"1234", "5678"};
	private String[] memMails = {"gildong@gmail.com", "chanho@naver.com"};
	private String[] memPhones = {"010-1234-5678", "010-0000-0000"};
	
	public void signUpForDumy(MemberService memberService) {
		
		for (int i = 0; i < memIds.length; i++) {
			MemberDto memberDto = 
					new MemberDto(
							memIds[i],
							memPws[i],
							memMails[i],
							memPhones[i]);
			
			memberService.signUp(memberDto);
			
		}
		
	}
}



//package com.office.member;
//
//import java.util.Scanner;
//
//public class MemberController {
//
//	final private MemberService memberService;
//	
//	public MemberController(MemberService memberService) {
//	this.memberService = memberService;
//	}
//	
//	
//	public void doSignUp(Scanner scanner) {
//		System.out.println("Input new member ID");
//		String memberId = scanner.next();
//		
//		while (true) {
//			Member member = db.memberDB.get(memberId);
//			if (member != null) {
//				System.out.println("Input new member ID");
//				memberId = scanner.next();
//				
//			} else {
//				break;
//			}
//		}
//		
//		System.out.println("Input new member PW");
//		String memberPw = scanner.next();
//		
//		while (true) {
//			if (memberPw.length() >= 4) {
//				System.out.println("Input new member PW");
//				memberPw = scanner.next();
//				
//			} else {
//				break;
//			}
//			
//		}
//		
//		System.out.println("Input new member MAIL");
//		String memberMail = scanner.next();
//		
//		System.out.println("Input new member PHONE");
//		String memberPhone = scanner.next();
//		
//}