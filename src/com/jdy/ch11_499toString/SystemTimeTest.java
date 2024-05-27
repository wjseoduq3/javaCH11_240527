package com.jdy.ch11_499toString;

public class SystemTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();  // 현재시간을 1/1000 초로 표시
		long time2 = System.nanoTime();  // 현재시간을 1/10e9 초로 표시
		
		System.out.println(time1);
		System.out.println(time2);
		
		// ---------------------------------------------------
		long t1 = System.currentTimeMillis();  // 시작시간
		long a1 = System.nanoTime(); 
		
		int sum = 0;
		for(int i=0;i<=1000000000;i++) {
			sum =sum + i;
		}
		
		long t2 = System.currentTimeMillis();  // 종료시간
		long a2 = System.nanoTime(); 
		
		System.out.println(t2 - t1);  // 소요시간
		System.out.println(a2 - a1);	
		
	}

}
