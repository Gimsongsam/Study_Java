package ch7;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{

    int x = 200;

    void method(){
        System.out.println("Child Method");

        System.out.println("x=" + x);               // 자손
        System.out.println("this.x=" + this.x);     // 자손
        System.out.println("super.x="+ super.x);    // 조상
    }
}

