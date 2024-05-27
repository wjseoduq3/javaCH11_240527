package com.jdy.ch11_499toString;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ran1 = Math.random();  // 0.0~1.0 사이의 실수를 반환
		// 0.0 <= ran1 < 1.0
		System.out.println(ran1);  
		
		// lotto 번호 출력
		
		int lotto1 = (int)(ran1 * 45);
		System.out.println(lotto1+1); // 0 ~ 44 --> 0 ~ 45
		
	}

}
