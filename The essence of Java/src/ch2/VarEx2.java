package ch2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0; // 임시 저장소

        System.out.println("x: "+ x + " y: "+ y);

        tmp = x; // 임시 저장소에 변수 x에 값 10을 넣는다.
        x = y;   // 변수 x에 변수 y값 20을 옮긴다.
        y = tmp; // 임시로 저장해놓았던 x 변수 값을 y에 넣는다.

        System.out.println("x: "+ x + " y: "+ y);
    }
}
