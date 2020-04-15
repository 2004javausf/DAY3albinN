package com.revature.DAY3;

public class Rectangle {

	private float sidea;
	private float sideb;
	private float area;
	
	
	public float getSideA() {
		return sidea;
	}
	public float getSideB() {
		return sideb;
	}
	public void setSideA(float sidea) {
		this.sidea = sidea;
	}
	public void setSideB(float sideb) {
		this.sideb = sideb;
	}
	public float getArea() {
		area = sidea * sideb;
		return area;
	}
	



}
