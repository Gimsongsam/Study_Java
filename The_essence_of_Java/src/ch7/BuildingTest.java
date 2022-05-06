package ch7;

interface Buildable{
    /** 건물을 들어 올린다. */
    void liftOff(); // public abstract가 생략되었다.
    /** 건물을 이동한다. */
    void move(int x, int y);
    /** 건물을 정지시킨다. */
    void stop();
    /** 건물을 착륙시킨다. */
    void land();

}

class BuildableImpl implements Buildable{
    public void liftOff() {
        System.out.println("liftoff");
    }
    public void move(int x, int y) {
        System.out.println("x: " + x + "y: " + y);
    }
    public void stop() {
        System.out.println("stop");
    }
    public void land(){
        System.out.println("land");
    }
}

public class BuildingTest {
    public static void main(String[] args) {

    }
}

class Academy{}
class Bunker extends BuildableImpl{}
class Barrack {}
class Factory extends BuildableImpl{}
