package com.office.inheri.restaurant;

public class ChildRestaurant 
					extends ParentRestaurant
					implements CheckList, CheckList2 {

	public final static int PARENT_MENU = 1;
	public final static int CHILD_MENU = 2;
	
	public void makeBokkeumbap() {
		System.out.println("아들꺼! 볶음밥 만듦!!");
	}
	
//	@Override
	public void makeJajang(int memu) {
		if (memu == PARENT_MENU) {
			super.makeJajang();
		} else {
			System.out.println();
		}
		System.out.println("아들꺼! MZ세대 자장면 만듦!");
	}
	
	@Override
	public void makeTangsuyuk() {
		System.out.println("아들꺼! 탕수육 만듦!");
	}

	@Override
	public void checkFloor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkFloorlet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkHwagu() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
