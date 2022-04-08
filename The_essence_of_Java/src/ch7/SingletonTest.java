package ch7;

final class Singleton{
    private static Singleton s = new Singleton(); // getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static이어야 한다.

    private Singleton(){ // private로 지정하여 인스턴스의 생성을 제한한다.
        //...            // private: 같은 클래스 내에서만 접근이 가능하다.
    }

    public static Singleton getInstance(){ // 인스턴스를 생성해서 반환해주는 public메서드를 제공함으로써
                                            // 외부에서 이 클래스의 인스턴스를 사용하도록 할 수 있다.
        if(s==null)
            s = new Singleton();
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton(); // 에러! Singleton() has private access in Singleton

        Singleton s = Singleton.getInstance();
        System.out.println("Singleton: " + s);
    }
}
