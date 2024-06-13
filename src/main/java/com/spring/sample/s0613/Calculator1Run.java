package com.spring.sample.s0613;

public class Calculator1Run {
	public static void main(String[] args) {
		// setter를 이용한 값 주입방법
		Calculator1 calc = new Calculator1();
		
		calc.setSu1(100);
		calc.setSu2(200);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
