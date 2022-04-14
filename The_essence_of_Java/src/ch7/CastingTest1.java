package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        FireEngine fe3 = null;
        Ambulance am = new Ambulance();

        fe.water();
        // car.water();    // 컴파일 에러!! Car타입의 참조변수로는 water()를 호출할 수 없다.
        car = fe;   // car = (Car)fe; 에서 형변환이 생략된 형태다.
        fe2 = (FireEngine)car; // 자손타입 <-- 조상타입
        fe2.water();

        // fe3 = (FireEngine)am; // 같은 자손끼리는 형변환이 불가능하다.
    }
}

class Car{
    String color;
    int door;

    void drive() {  // 운전하는 기능
        System.out.println("drive, Brrrr~~");
    }
    void stop(){    // 멈추는 기능
        System.out.println("stop!!");
    }
}
class FireEngine extends Car{   // 소방차
    void water(){   // 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}

class Ambulance extends Car{
    void Siren(){
        System.out.println("Siren~~~~");
    }
}
