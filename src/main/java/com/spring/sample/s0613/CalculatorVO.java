package com.spring.sample.s0613;

public class CalculatorVO {
	private int su1;
	private int su2;
	
	public int getSu1() {
		return su1;
	}
	public void setSu1(int su1) {
		this.su1 = bigyo(su1);
	}
	public int getSu2() {
		return su2;
	}
	public void setSu2(int su2) {
		this.su2 = bigyo(su2);
	}
	
	private int bigyo(int su) {
		int res = 0;
		if(su > 0) res = su;
		return res;
	}
	
	
}
