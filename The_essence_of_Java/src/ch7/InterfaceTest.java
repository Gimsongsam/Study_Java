package ch7;

interface I {
    public abstract void play();
    public abstract void methodB();
    public abstract void methodC();
}

class InstanceManager{
    public static I getInstanceB(){
        return new B();
    }
    public static I getInstanceC(){
        return new C();
    }
}

class A{
    void methodA(){
        I b = InstanceManager.getInstanceB();
        I c = InstanceManager.getInstanceC();
        b.methodB();
        c.methodC();
    }
    void authPlay(I i){
        i.play();
    }
}

class B implements I {
    public void play(){
        System.out.println("play in B class");
    }

    public void methodB(){
        System.out.println("method in B class");
    }

    public void methodC(){
        System.out.println("method in C class");
    }

    public String toString(){return "class B";}
}

class C implements I {
    public void play(){
        System.out.println("play in C class");
    }
    public void methodB(){
        System.out.println("method in B class");
    }
    public void methodC(){
        System.out.println("method in C class");
    }

}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.authPlay(new B()); // void authPlay(I i) 호출
        a.authPlay(new C()); // void authPlay(I i) 호출

        a.methodA();
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

