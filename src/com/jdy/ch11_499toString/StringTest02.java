package com.jdy.ch11_499toString;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "오늘은 자바 프로그래밍!!";
		
		String str2 = str1.replace("자바", "JAVA");
		System.out.println(str2);
		
		String str3 = str1.replace("저버", "JAVA");
		System.out.println(str3);
		
		String ssn = "880723-1230987";
		System.out.println(ssn.substring(7));
		System.out.println(ssn.substring(7,9));
		
		String str4 = "   오늘은 자바 프로그래밍!!   ";
		System.out.println(str4.trim());
		
		//--------------------------------------------------
		
		String no1 ="10";
		String no2 ="10.119";
		
		int num1 = Integer.parseInt(no1);  // 매우 중요
		double num2 = Double.parseDouble(no2);
		
		System.out.println(num1/2);
		System.out.println(num2/2);
		
		int val1 = 112;
		String strVal1 = String.valueOf(val1);
		System.out.println(strVal1);
		
		double val2 = 3.14;
		String strVal2 = String.valueOf(val2);
		System.out.println(strVal2);
			
	}

}
