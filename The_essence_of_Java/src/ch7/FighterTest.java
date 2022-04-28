package ch7;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        StartCraft s = new StartCraft();

        f.move(1, 5);
//        f.attack(StartCraft.Marine);  // ??

        if(f instanceof Unit)
            System.out.println("f는 Unit클래스의 자손입니다.");
        if(f instanceof Fightable)
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        if(f instanceof Movable)
            System.out.println("f는 Movable인터페이스를 구현했습니다.");
        if(f instanceof Attackable)
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");
        if(f instanceof Object)
            System.out.println("f는 Object 클래스의 자손입니다.");
    }


}

class Fighter extends Unit implements Fightable{    // Unit 클래스로부터 상속, Fightable 인터페이스만을 구현
    public void move(int x, int y){     // 제어자를 public으로 했다.
                                        // 오버라이딩을 할 때는 조상의 메서드보다 넓은 범위의 접근 제어자를 지정해야 한다.
        System.out.println(x + y + "으로 이동했습니다.");
    }
    public void attack(StartCraft u) {
        System.out.println(u + "(이)가 공격을 시작했습니다.");
    }
}

interface Fightable extends Movable, Attackable{}
interface Movable { void move(int x, int y); } // public abstract가 생략되어있다.
interface Attackable { void attack(StartCraft u); }