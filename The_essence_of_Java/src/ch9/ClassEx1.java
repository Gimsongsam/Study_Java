package ch9;

// Class 객체는 클래스의 모든 정보를 담고 있으며, 클래스 당 1개만 존재한다.
// 클래스 파일이 '클래스 로더'에 의해서 메모리에 올라갈 때, 자동으로 생성된다.
// 클래스 로더는 파일 형태로 저장되어 있는 클래스(Card.class)를 읽어서 Class 클래스에 정의된 형식으로 변환한다.
// 즉, 클래스 파일을 읽어서 사용하기 편한 형태로 저장해 놓은 것이 클래스 객체이다.

// Class 객체를 얻는 방법


final class Card2{
    String kind;
    int num;

    Card2(){
        this("SPACE", 3);
    }

    Card2(String kind, int num){
        this.kind = kind;
        this.num = num;
    }

    public String toString(){
        return kind + ":" + num;
    }
}

public class ClassEx1 {
    public static void main(String[] args) throws Exception {
        Card2 c = new Card2("HEART", 5); // new 연산자로 객체 생성
        Card2 c2 = Card2.class.newInstance(); // Class객체를 통해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
