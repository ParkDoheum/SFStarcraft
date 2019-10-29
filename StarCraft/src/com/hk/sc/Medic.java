package com.hk.sc;

public class Medic extends Unit {
	Medic() {
		max_hp = 60;
		hp = max_hp;
		movingSpeed = 1;
	}
	
	@Override
	public String toString() {
		return "Medic " + super.toString();
	}
	
	public void heal(Unit unit) {
		//1씩 치료를 해야
		while(unit.max_hp > unit.hp) {
			unit.hp++;
		}
	}
}
