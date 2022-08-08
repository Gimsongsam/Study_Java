package practice;

class Initialization {
    int a;
    static int b;
    static int c;

    // 초기화 블럭
    {
        a++;
        b++;
    }

    static{
        c++;
    }
}

public class InitializationTest{
    public static void main(String[] args) {
//        Initialization soutA1 = new Initialization();
//        Initialization soutA2 = new Initialization();
//        Initialization soutA3 = new Initialization();
//        System.out.println(Initialization.b);
//        System.out.println(Initialization.b);
//        System.out.println(Initialization.b);

        // 스테틱
        System.out.println("static1");
        Initialization soutA1 = new Initialization();
        System.out.println(Initialization.b);
        Initialization soutA2 = new Initialization();
        System.out.println(Initialization.b);
        Initialization soutA3 = new Initialization();
        System.out.println(Initialization.b);

        // 인스턴스는 생성될때 마다 초기화
        System.out.println("Instant");
        System.out.println(soutA1.a);
        System.out.println(soutA2.a);
    }
}