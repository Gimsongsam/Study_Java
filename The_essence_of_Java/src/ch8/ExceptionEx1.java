package ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try{
            // catch 블럭의 괄호 내에 선언된 변수는 catch블럭 내에서만 유효하다.
            try{  } catch (Exception e){   }
        }catch (Exception e){
            // try {  } catch (Exception e) {  } // 에러. catch블럭에 선언된 두 참조변수의 영역이 서로 겹친다.
                                                 // 서로 다른 이름을 사용해야만 서로 구별된다.
            try {  } catch (Exception a) {   }
        } // try-catch의 끝

        try{

        } catch (Exception e){

        } // try-catch의 끝
    } // main 메서드의 끝
}
