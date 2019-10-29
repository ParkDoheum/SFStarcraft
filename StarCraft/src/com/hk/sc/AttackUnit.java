package com.hk.sc;

public class AttackUnit extends Unit {
	int powerOfAttack;

	void attack(Unit unit) {
		//unit.hp = unit.hp - powerOfAttack;
		
		unit.hp -= powerOfAttack;
	}
	
	@Override
	public String toString() {
		return String.format("poa: %d, %s"
				, powerOfAttack, super.toString());
	}
}
