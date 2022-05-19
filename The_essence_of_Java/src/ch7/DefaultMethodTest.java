package ch7;

public class DefaultMethodTest {
    public static void main(String[] args) {

    }
}

class Child2 extends Parent implements MyInterface, MyInterface2{
    public void method1(){
        System.out.println("method1() in Child");   // 오버라이딩
    }
}

class Parent2{
    public void method2(){
        System.out.println("method2() in Parent");
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
