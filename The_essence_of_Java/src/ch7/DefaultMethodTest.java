package ch7;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child2 c2 = new Child2();

        c2.method1();
        c2.method2();
//        c2.staticMethod();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child2 extends Parent2 implements MyInterface, MyInterface2{
    public void method1(){
        System.out.println("method1() in Child2");   // 오버라이딩
    }
}

class Parent2{
    public void method2(){
        System.out.println("method2() in Parent2");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}
