package ch3;

public class OperatorEx9 {
    public static void main(String[] args) {
        // int와 int의 연산결과는 int타입인데, int타입의 최대값을 넘으므로 오버플로우가 발생한다.
        // 이미 오버플로우가 발생한 값을 아무리 long 타입의 변수에 저장을 해도 소용이 없다.
        long a = 1_000_000 * 1_000_000;    // a=-727379968

        // int타입과 long타입의 연산이기 때문에 그 결과가 long타입이다. 올바른 결과를 저장할 수 있다.
        long b = 1_000_000 * 1_000_000L;  //  b=1000000000000

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
