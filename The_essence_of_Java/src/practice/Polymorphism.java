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
    void caption(){/* 내용생략 */};
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


    }
}
