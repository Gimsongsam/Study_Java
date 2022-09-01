package practice;

import java.awt.*;
import java.util.Arrays;

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

        System.out.println("c1" + c1);
        System.out.println("c2" + c2);

        System.out.println("원점: " + c1.p + " 반지름: " + c1.r);
        System.out.println("원점: " + c2.p + " 반지름: " + c2.r);

        System.out.println("c1 변경 후");

        c1.p.x = 6;
        c1.p.y = 6;
        c1.r = 5.5;

        System.out.println("원점: " + c1.p + " 반지름: " + c1.r);
        System.out.println("원점: " + c2.p + " 반지름: " + c2.r);

        int[] arr = {1,2,3,4,5};
        int[] arrClone = arr.clone();

        System.out.println("arr" + Arrays.toString(arr));
        System.out.println("arrClone" + Arrays.toString(arrClone));

        arr[2] = 9;

        System.out.println("변경 후");
        System.out.println("arr" + Arrays.toString(arr));
        System.out.println("arrClone" + Arrays.toString(arrClone));

    }
}
