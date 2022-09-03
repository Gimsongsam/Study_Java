package ch9;

// String 클래스에는 문자열을 저장하기 위해서 문자형 배열 참조변수(Char[]) value를 인스턴스 변수로 정의 해놓고 있다.
// 한번 생성된 String 인스턴스가 갖고 있는 문자열은 읽어 올 수만 있고, 변경할 수는 없다.
// ex) '+' 연산자를 이용해서 문자열을 결합하는 경우 인스턴스 내의 문자열이 바뀌는 것이 아니라 새로운 문자열("ab")이 담긴 String 인스턴스가 생성된다.
// 따라서 덧셈연산자를 사용해서 문자열을 결합하는 것은 매 연산 시 마다 새로운 문자열을 가진 String 인스턴스가 생성되어 메모리공간을 차지하게 되므로 가능한 한 결합횟수를 줄이는 것이 좋다.


// 문자열의 비교
// 문자열을 만들 때는 두 가지 방법, 문자열 리터럴을 지정하는 방법과 String 클래스의 생성자를 사용해서 만드는 방법이 있다.
// String 클래스의 생성자를 이용한 경우에는 new연산자에 의해서 메모리할당이 이루어지기 때문에 항상 새로운 String 인스턴스가 생성된다.
// 그러나 문자열 리터럴은 이미 존재하는 것을 재사용하는 것이다.
public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ? " + (str1 == str2)); // true
        System.out.println("str1.equals(str2) ? " + str1.equals(str2)); // true
        System.out.println();


        String str3 = new String("\"abc\"");
        String str4 = new String("\"abc\"");
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str3 == str4 ? " + (str3 == str4)); // false
        System.out.println("str3.equals(str4) ? " + str3.equals(str4)); // true


    }

}
