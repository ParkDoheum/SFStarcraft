package com.hk.sc;

public class Game {

	public static void main(String[] args) {
		Marine m1 = new Marine();	
		FireBat f1 = new FireBat();
		Medic d1 = new Medic();
		SiegeTank siege = new SiegeTank();
		siege.attack(d1);
		
		siege.changeMode();
		siege.attack(f1);
		
		System.out.println(d1);
		System.out.println(f1);
		
		
		
		
		
	}
	
}
