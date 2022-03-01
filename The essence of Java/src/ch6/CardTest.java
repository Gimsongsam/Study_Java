package ch6;

public class CardTest {
    public static void main(String[] args) {
        // 클래스변수(static 변수)는 객체생성없이 '클래스이름.클래스변수'로 직접사용 가능하다.
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.width = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        // 인스턴스변수의 값을 변경한다.
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number +
                "이며, 크기는 (" + c1.width + "," + c1.number + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number +
                "이며, 크기는 (" + c2.width + "," + c2.number + ")");
        System.out.println("c1의 width와 heigth를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number +
                "이며, 크기는 (" + c1.width + "," + c1.number + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number +
                "이며, 크기는 (" + c2.width + "," + c2.number + ")");
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}