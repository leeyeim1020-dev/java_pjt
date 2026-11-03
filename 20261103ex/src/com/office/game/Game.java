package com.office.game;

import java.util.Iterator;

public class Game {
	
	private Bear bear;
	private Robot robot;
	private AirPlain airPlain;
	private Dog dog;
	private ICharactor[] iCharactors;
	
	
	
	public Game(Bear bear, Robot robot, AirPlain airPlain, Dog dog) {
		this.bear = bear;
		this.robot = robot;
		this.airPlain = airPlain;
		this.dog = dog;
	
		
		iCharactors = new ICharactor[] {
				this.bear,
				this.robot,
				this.airPlain,
				this.dog
		}
	}


	public void move(int x, int y) {
//		bear.walk(x, y);
//		robot.run(x, y);
//		dog.run(x, y);
//		airPlain.fly(x, y);
		
//		bear.run(x, y);
//		robot.run(x, y);
//		dog.run(x, y);
//		airPlain.run(x, y);
			
		for (int i = 0, i < iCharactors )
	}
	
}
