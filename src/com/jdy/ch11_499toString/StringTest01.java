package com.jdy.ch11_499toString;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Korea";
		
		System.out.println(str1.charAt(2));
		
		String str2 = new String("Korea");  // 클래스의 전형저 방식 --> 위의 형식으로 간편화함
		
		int[] intArray = {1,2,3,4,5};
		// String str3 = new String(intArray);  에러 발생  --> byte 배열과 문자만 받아줌
		
		int a = 10;
		// String str4 = new String(a);  에러 발생  --> byte 배열과 문자만 받아줌
		
		byte[] byteArray = {72,101,108,108,111};
		String str5 = new String(byteArray);  // Ascii 코드값으로 받아줌
		System.out.println(str5);
		
		String str6 = new String(byteArray,2,3);
		System.out.println(str6);
		//----------------------------------------------------
		String str7 = "자바프로그래밍";
		int y1 = str7.indexOf("프");
		System.out.println(y1);
		
		String str8 = "자바프로그래밍";
		int y2 = str8.indexOf("그래");  // 첫글자 인덱스만 찍힘
		System.out.println(y2);
		
		String str9 = "자바프로그래밍";
		int y3 = str9.indexOf("왕자");  // 없으면 -1 반환
		System.out.println(y3);
		
		if (str7.indexOf("푸로") != -1) {
			
		} else {
			
		}
		
		int length = str8.length();
		System.out.println(length);
		
		
	}

}
