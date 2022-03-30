package ch7;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent{
    int x = 10;
}

class Child extends Parent{

    int x = 20;

    void method(){
        System.out.println("x=" + x);               // 자손
        System.out.println("this.x=" + this.x);     // 자손
        System.out.println("super.x="+ super.x);    // 조상
    }
}

