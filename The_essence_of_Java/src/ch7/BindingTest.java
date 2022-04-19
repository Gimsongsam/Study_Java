package ch7;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.methodTest();

        System.out.println("p.c = " + c.x);
        c.methodTest();
    }
}

