package com.hk.sc;

public class Academy extends Building {

	@Override
	void depart() {
		System.out.println("이륙할 수 없습니다.");
	}

	@Override
	void landing() {
		System.out.println("착륙할 수 없습니다.");
	}
	
}
