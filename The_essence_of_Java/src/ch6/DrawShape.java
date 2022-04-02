package ch6;

public class DrawShape {
    public static void main(String[] args) {
        Point[] p = {   new Point(100, 100),
                        new Point(50, 60),
                        new Point(30, 90),
                    };
        System.out.println(p[0].getXY());
        System.out.println(p[1].getXY());
        System.out.println(p[2].getXY());

        Shape s = new Shape();
        s.draw();
        s.draw("yellow");

        Circle c = new Circle(new Point(150, 150), 50);
        Triangle t = new Triangle(p);
        c.draw(); // 원을 그린다.
        t.draw(); // 삼각형을 그린다.

    }
}

class Shape{
    String color = "black";

    void draw(){
        System.out.printf("[color=%s]%n", color);
    }

    void draw(String color){
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y){    // 생성자 메소드 호출시
        this.x = x;     // this.x -> 인스턴스 int x;
        this.y = y;     // this.y -> 인스턴스 int y;
    }
    Point(){    // 생성자 메소드를 호출하지 않을 때
        this(0,0);
    }

    String getXY(){
        return "("+x+", "+y+")";    // x와 y의 값을 문자열로 반환
    }
}

class Circle extends Shape{
    Point center;       // 원의 원점좌표
    int r;              // 반지름

    Circle(){
        this(new Point(0,0), 100);  // Circle(Point center, int r)를 호출
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    void draw(){
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape{
    Point[] p = new Point[3];

    Triangle(Point[] p){
        this.p = p;
    }

    void draw(){
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",p[0].getXY(),p[1].getXY(), p[2].getXY(), color);
    }

}