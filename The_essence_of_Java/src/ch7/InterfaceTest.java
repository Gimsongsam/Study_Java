package ch7;

interface I {
    public abstract void play();
}

class InstanceManager{
    public static I getInstance(){
        return new B();
    }
}

class A{
    void methodA(){
        I i = InstanceManager.getInstance();
    }
    void authPlay(I i){
        i.play();
    }
}

class B implements I {
    public void play(){
        System.out.println("play in B class");
    }
}

class C implements I {
    public void play(){
        System.out.println("play in C class");
    }
}

//class A {
//    public void method(B b){
//        b.methodB();
//    }
//}
//
//class B{
//    public void methodB(){
//        System.out.println("methodB()");
//    }
//}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.authPlay(new B()); // void authPlay(I i) 호출
        a.authPlay(new C()); // void authPlay(I i) 호출
    }
}
