package practice;

import java.awt.*;

class Circle implements Cloneable{
    Point p; // 원점 - 참조변수
    double r; // 반지름

    public Circle clone(){ // 얕은 복사
        Object obj = null;
        try{
            obj = super.clone(); // 조상인 Object의 clone()을 호출한다.
        }catch (CloneNotSupportedException e){}
        return (Circle)obj;
    }
}

public class Clone {

}
