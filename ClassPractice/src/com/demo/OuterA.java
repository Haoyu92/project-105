package com.demo;

public class OuterA {

	int x = 100;
	private int y = 200;
	
	class InnerA{
		String str = "Hello";
		
		void showIn() {
			System.out.println(str);
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	void showOut() {
		InnerA obj = new InnerA();
		obj.showIn();
	}
	
	public static void main(String a[]){
		new OuterA().showOut();
	}
}
