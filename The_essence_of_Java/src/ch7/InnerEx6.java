package ch7;

public class InnerEx6 {
    public static void main(String[] args){
        noName nn = new noName();

        nn.myMethod();
    }

}

class noName{
    Object iv = new Object(){ void method(){
        System.out.println("I'm iv");
    }};         // 익명 클래스
    static Object cv = new Object(){ void method(){
        System.out.println("I'm cv");
    } }; // 익명 클래스

    void myMethod(){
//        Object lv = new Object();
        Object lv = new Object(){ void method(){
            System.out.println("This is My Method");
        } };    // 익명 클래스
    }
}
