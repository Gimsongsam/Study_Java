package practice;

class Initialization {
    int a;
    static int b;

    // 초기화 블럭
    {
        a++;
        b++;
    }
}

public class InitializationTest{
    public static void main(String[] args) {
//        Initialization soutA1 = new Initialization();
//        System.out.println(soutA1.b);
//
//        Initialization soutA2 = new Initialization();
//        System.out.println(soutA2.b);
//
//        Initialization soutA3 = new Initialization();
//        System.out.println(soutA3.b);

        // 스테틱
        System.out.println("static1");
        Initialization soutA1 = new Initialization();
        System.out.println(soutA1.b);
        Initialization soutA2 = new Initialization();
        System.out.println(soutA2.b);
        Initialization soutA3 = new Initialization();
        System.out.println(soutA3.b);

        // 인스턴스는 생성될때 마다 초기화
        System.out.println("Instant");
        System.out.println(soutA1.a);
        System.out.println(soutA2.a);
    }
}