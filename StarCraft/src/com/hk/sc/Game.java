package com.hk.sc;

public class Game {

	public static void main(String[] args) {
		Barrack brrack = new Barrack();
		
		Unit u = brrack.makeUnit(2);
		
		System.out.println(u);		
		
		Building b = new Barrack();
		b.landing();
		
		b = new Academy();
		b.landing();
	}
	
}
