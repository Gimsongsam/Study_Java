package ch6;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change (Data a) { // 참조형 매개변수. 데이터 주소의 공간을 받아온다.
        a.x = 1000;
        System.out.println("change() : x " + a.x);
    }
}
