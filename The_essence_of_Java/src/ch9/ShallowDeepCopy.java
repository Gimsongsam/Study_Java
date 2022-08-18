package ch9;

class Circle implements Cloneable{
    Point p; // 원점
    double r; // 반지름

    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy(){ // 얕은 복사
        Object obj = null;

        try{
            obj = super.clone();
        } catch (CloneNotSupportedException e){}

        return (Circle) obj;
    }

    public Circle deepCopy(){ // 깊은 복사
        Object obj = null;
        try{
            obj = super.clone();
        } catch (CloneNotSupportedException e){}



        return (Circle) obj;
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {

    }
}
