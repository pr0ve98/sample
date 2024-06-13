package com.spring.sample.s0613;

public class BMIService {
	public void getLine() {
		System.out.println("=====================================");
	}

	public void printTitle() {
		System.out.println("성명\t키\t몸무게\t비만도\t결과");
	}

	public BMIVO calc(BMIVO vo) {
		double heightP = (vo.getHeight() / 100.0);
		double bmi = (vo.getWeight() / (heightP * heightP));
		
		String result = "";
		if(bmi < 18.5) result = "저체중";
		else if(bmi < 23) result = "표준";
		else if(bmi <= 25) result = "과체중";
		else result = "비만";
		
		
		vo.setBmi(bmi);
		vo.setResult(result);
		
		return vo;
	}

	public void printBMI(BMIVO vo) {
		System.out.print(vo.getName()+"\t"+vo.getHeight()+"cm\t"+vo.getWeight()+"kg\t");
		System.out.printf("%.1f", vo.getBmi());
		System.out.println("\t"+vo.getResult());
	}
}
