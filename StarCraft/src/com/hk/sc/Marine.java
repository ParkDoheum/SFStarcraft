package com.hk.sc;

public class Marine extends AttackUnit implements Healable {
	
	//마린 객체화 
	//max_hp 값은 40
	//hp 40
	//공격력 6
	//이동속도 1
	
	Marine() {
		max_hp = 40;
		hp = max_hp;
		powerOfAttack = 6;
		movingSpeed = 1;
	}
	
	@Override
	public String toString() {
		return "Marine " + super.toString();
	}	
}
