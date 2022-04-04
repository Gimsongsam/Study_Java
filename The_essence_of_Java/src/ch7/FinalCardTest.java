package ch7;

class Card{
    final int NUMBER;       // 상수지만 선언과 함께 초기화 하지 않고
    final String KIND;      // 생성자에서 단 한번만 초기화할 수 있다.
    static int width = 100;
    static int height = 250;

    Card(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }

    Card(){
        this("HEART", 1);
    }

    public String toString(){
        return KIND + " " +NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card c1 = new Card("HEART", 10);
        Card c2 = new Card();

        // c1.NUMBER = 5; // 에러! cannot assign a value to final variable NUMBER

        System.out.println("c1: "+c1);
        System.out.println("c2: "+c2);
    }



}
