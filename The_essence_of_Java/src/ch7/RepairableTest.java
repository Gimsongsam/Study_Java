package ch7;


class GroundUnit extends Unit{
    GroundUnit(int hp){
        super(hp);
    }
}

class AirUnit extends Unit{
    AirUnit(int hp){
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString(){
        return "Tank";
    }
    // ...
}

class Dropship extends AirUnit implements Repairable{
    Dropship(){
        super(40);
        hitPoint = MAX_HP;
    }

    public String toString(){
        return "Dropship";
    }
    // ...
}


class Marin extends GroundUnit{
    Marin(){
        super(40);
        hitPoint = MAX_HP;
    }

    public String toString(){
        return "Marin";
    }
    // ...
}

class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r){  // Repairable 인터페이스에 정의된 멤버만 받아들여진다.
        if (r instanceof Unit){
            Unit u = (Unit)r;   // Repaire에는 정의된 멤버가 없으므로 이 타입의 참조변수로 할 수 있는 것이 없다.
                                // 타입 체크한 뒤 캐스팅하여 Unit클래스에 정의된 hitPoint 와 Max_HP를 사용할 수 있도록 함.
            while(u.hitPoint != u.MAX_HP){
                /* Unit의 HP를 증가시킨다. */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}



public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marin marin = new Marin();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
        // scv.repair(marin); // error!
    }
}
