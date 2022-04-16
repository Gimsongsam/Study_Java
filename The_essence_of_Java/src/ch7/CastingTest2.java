package ch7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
//        Car car = new FireEngine(); // <- 와 같이 사용해야 실행 시 에러가 발생하지 않는다.
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car; // 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않는다.
                              // 컴파일은 OK, 실행 시 에러가 발생한다.
                              // 변수 car가 조상의 인스턴스클래스 Car를 참조하고있다.
        fe.drive();
        fe.water();
        car2 = fe;
        car2.drive();
    }
}
