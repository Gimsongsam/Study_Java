package ch8;

public class ExceptionEx10 {
//    public static void main(String[] args) {
//        throw new Exception();  // Exception을 고의로 발생시킨다.
//                                // 예외처리를 해주지 않으면 컴파일조차 되지 않는다.
//    }

    public static void main(String[] args) {
        throw new RuntimeException();   // RuntimeException 을 고의로 발생시킨다.
                                        // 예외처리를 해주지 않았음에도 성공적으로 컴파일된다.
    }


}
