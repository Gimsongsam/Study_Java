package ch6;

class Car{
    String color;       // 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;           // 문의 개수

    static int tire = 4;

    // Car() { }

    // Car(String c, String g, int d){
    //      color = c;
    //      gearType = g;
    //      door = d;
    //  }

    Car(){
        this("white", "auto", 4, 4);   // Car(String color, String gearType, int door) 호출
    }                                                   // 또 다른 생성자

    Car(String color){
        this(color, "auto", 4, 4);     // Car(String color, String gearType, int door) 호출
                                                    // 또 다른 생성자
//        this.color = color;
    }

    Car(String color, String gearType, int door, int tire){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
        this.tire = tire;
    }

}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4, 6);

        System.out.println("c1의 color=" + c1.color + ", gearType="
                                            + c1.gearType+ ", door="+c1.door + ", tire="+c1.tire);
        System.out.println("c2의 color=" + c2.color + ", gearType="
                                            + c2.gearType+ ", door="+c2.door + ", tire="+c1.tire);
    }


}
