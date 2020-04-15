package com.revature.DAY3;

public class Driver {

	public static void main(String[] args) {
		Rectangle s = new Rectangle();
		s.setSideA(3);
		s.setSideB(2);
		System.out.println(s.getSideA());
		System.out.println(s.getSideB());
		System.out.println(s.getArea());

		Animals a = new Animals();
		a.setColor("purple");
		a.setType("snake");
		System.out.println(a.getType());
		System.out.println(a.getColor());
	}

}
