package ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(4, 9, 3);
        System.out.println(p3.getLocation());

        Point p = new Point(5, 6);
        System.out.println(p.getLocation());
    }
}

class Point{
    int x, y;

    Point(){};  // 넣어주거나 Point(int x, int y)를 호출하도록 변경한다.
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends Point{
    int z;

    Point3D(int x, int y, int z){
//        super(x, y);    // Point3D의 생성자의 첫 줄이 생성자를 호출하는 문장이 아니기 때문에 컴파일러는
                        // 자동적으로 super();를 넣어 준다.
                        // Point3D클래스의 인스턴스를 생성하면, super();를 수행하게 된다.
                        // super();는 Point3D 클래스의 조상인 Point클래스의 기본 생성자인 Point()를 뜻하므로 Point가 호출된다.
                        // 그러나 Point클래스에 생성자 Point()가 정의되어 있지 않기 때문에 컴파일 에러가 발생한다.
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation(){   // 오버라이딩
        return "x: " + x + ", y :" + y + ", z: " + z;
    }
}