package com.spring.sample.s0613;

public class Calculator2Run {
	public static void main(String[] args) {
		// 생성자에서 값 주입 방법
		Calculator2 calc = new Calculator2(50, 100);
		
//		calc.setSu1(100);
//		calc.setSu2(200);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
