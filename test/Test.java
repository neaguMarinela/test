package com.uteachon.oopconcepts;

public class Test {
	class TestInner{
		void sayHi(){
			System.out.println("Hi");
		}
	}
	
	public static void main(String[] args) {
		TestInner inner = new Test().new TestInner();
		inner.sayHi();
	}
}
