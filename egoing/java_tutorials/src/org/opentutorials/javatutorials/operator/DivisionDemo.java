package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); // 10/3
		System.out.println(c/d); // 10.0F/3.0F
		
		// 10/3.0F
		System.out.println(a/d); // 자동적으로 형변환을 시킨다. - 실수로 변
	}

}
