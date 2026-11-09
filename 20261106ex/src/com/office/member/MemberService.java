package com.office.member;

public class MemberService implements IMemberService {

	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public void signUp(MemberDto memberDto) {
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		
			
		if (!isMember) {
			int result = memberDao.insertNewMember(memberDto);
			
			if (result == 0) {
				System.out.println("회원가입 실패입니다.");
				
			} else {
				System.out.println("회원가입 성공했습니다.");
				
			}
		} else {
			System.out.println("이미 존재하는 ID입니다.");
		}
		
	}
		
	

	@Override
	public void signIn(MemberDto memberDto) {
		
		MemberDto searchedMemberDto =
				memberDao.searchMemberByMemIdAndMemPw(memberDto);
				
		if (searchedMemberDto != null) {
			System.out.println("로그인 성공");
			
		} else {
			System.out.println("로그인 실패");
		}
		
	}

	@Override
	public void modify(MemberDto memberDto) {
		MemberDto updatedMemberDto = 
			memberDao.updateMemberByMemId(memberDto);
		
		if (updatedMemberDto != null) {
			System.out.println("Modify SUCCESS!");
		} else {
			System.out.println("Modify FAIL!");
		}
		
	}

	@Override
	public void delete(MemberDto memberDto) {
		
		
	}
	
	
	
	
		
}
