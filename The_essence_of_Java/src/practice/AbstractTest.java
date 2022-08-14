package practice;

abstract class Test { // 추상클래스
    abstract void check(String check);
}


public class AbstractTest {
    public static void main(String[] args) {
        check("test");
    }

    static void check(String a){
        System.out.println("true");
    }
}
