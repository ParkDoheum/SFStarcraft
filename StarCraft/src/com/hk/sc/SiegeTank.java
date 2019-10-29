package com.hk.sc;

public class SiegeTank extends AttackUnit {
	boolean siegeMode;
	int siegePowerOfAttack = 70;
	
	SiegeTank() {
		max_hp = 150;
		hp = max_hp;
		powerOfAttack = 30;
		movingSpeed = 1;
	}
	
	void changeMode() {
		siegeMode = !siegeMode;		
	}
	
	@Override
	public String toString() {
		return "siegeMode : " + siegeMode;
	}
	
	@Override
	void attack(Unit unit) {
		if(siegeMode) {
			unit.hp -= siegePowerOfAttack;
		} else {
			super.attack(unit);
		}
	}
	
}








