package practice;

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
class CaptionTv extends Tv{
    String text;
    void caption(){ System.out.println("caption()"); }
}

public class Polymorphism {
    public static void main(String[] args) {
        Tv t = new Tv();
        CaptionTv c = new CaptionTv();

        // 다형성
        Tv tt = new CaptionTv();

        c.caption();
        // System.out.println(tt.caption); // 사용할 수 없다.

        // 자손이 조상타입의 인스턴스를 참조하는 것은 안된다.
        // CaptionTv ct = new Tv();

        // 형변환을 해야 사용가능하다.
        CaptionTv ct = (CaptionTv)t;
        ct.caption();
        // 형변환은 참조변수의 타입을 변환하는 것이다.
        // 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위(개수)를 조절하는 것이다.

        System.out.println(ct instanceof CaptionTv);
    }
}
