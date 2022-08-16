package practice;

import java.awt.*;

class Circle implements Cloneable{
    Point p; // 원점 - 참조변수
    double r; // 반지름

    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }

    public Circle clone(){ // 얕은 복사
        Object obj = null;
        try{
            obj = super.clone(); // 조상인 Object의 clone()을 호출한다.
        }catch (CloneNotSupportedException e){}
        return (Circle)obj;
    }
}

public class Clone {
    public static void main(String[] args) {
        // c1과 c2는 같은 Point 인스턴스를 가리키게 된다.
        // 따라서 완전한 복제라고 볼 수 없다.
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.clone(); // 얕은 복사
    }
}
