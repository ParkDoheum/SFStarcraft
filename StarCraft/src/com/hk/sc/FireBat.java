package com.hk.sc;

public class FireBat extends AttackUnit {
	FireBat(){
		max_hp = 50;
		hp = max_hp;
		powerOfAttack = 8;
		movingSpeed = 1;
	}
	
	@Override
	public String toString() {
		return "FireBat " + super.toString();
	}
}
