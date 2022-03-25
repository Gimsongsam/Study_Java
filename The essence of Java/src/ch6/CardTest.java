package ch6;

public class CardTest {
    public static void main(String[] args) {
        // 클래스변수(static 변수)는 객체생성없이 '클래스이름.클래스변수'로 직접사용 가능하다.
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.width = " + Card.height);

        Card c1 = new Card();
        c1.str_kind = "Heart";
        c1.number = 7;

        // 인스턴스변수의 값을 변경한다.
        Card c2 = new Card();
        c2.str_kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.str_kind + ", " + c1.number +
                "이며, 크기는 (" + c1.width + "," + c1.number + ")");
        System.out.println("c2은 " + c2.str_kind + ", " + c2.number +
                "이며, 크기는 (" + c2.width + "," + c2.number + ")");
        System.out.println("c1의 width와 heigth를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.str_kind + ", " + c1.number +
                "이며, 크기는 (" + c1.width + "," + c1.number + ")");
        System.out.println("c2은 " + c2.str_kind + ", " + c2.number +
                "이며, 크기는 (" + c2.width + "," + c2.number + ")");
    }
}

class Card {
    static int width = 100;
    static int height = 250;
    String str_kind;

    static final int KIND_MAX = 4;  // 카드 무늬의 수
    static final int NUM_MAX = 13;  // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card(){
        this(SPADE, 1);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";    // 숫자 10은 x로 표현

        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }   // toString()의 끝
}   // Card 클래스의 끝