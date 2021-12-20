package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		// int a = 2.2; -> 정수형 변수에 실수형을 담았기 때문에 일치하지 않는다.
		//  float a = 2.2;
		double a = 2.2;
		
		float b = 2.2F; 
		// float 데이터 타입이라는 것을 명시적으로 지정해준다.
		// 실수형 상수는 double의 데이터이다.
		
		// int c = 2147483648; -> 범위를 넘어서므로 일치하지 않는다.
		long c = 2147483648L; // long이라는 것을 지정한다.
		
		byte x = 100; // int형이므로 에러가 나지 않는다. 
		

	}

}
