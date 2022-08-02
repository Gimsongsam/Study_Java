package ch9;

public class ToStringTest {
    public static void main(String[] args) {
        String str = new String("KOREA");
        java.util.Date today = new java.util.Date();

        // String 클래스와 Date클래스의 toString()을 호출하면
        // 클래스이름과 해시코드 대신 문자열이 출력되는 것을 알 수 있다.
        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());
    }
}
