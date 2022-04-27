package ch7;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        StartCraft s = new StartCraft();

        f.move(1, 5);
//        f.attack(StartCraft.Marine);  // ??
    }


}

class Fighter extends Unit implements Fightable{
    public void move(int x, int y){
        System.out.println(x + y + "으로 이동했습니다.");
    }
    public void attack(StartCraft u) {
        System.out.println(u + "(이)가 공격을 시작했습니다.");
    }
}

interface Fightable extends Movable, Attackable{}
interface Movable { void move(int x, int y); }
interface Attackable { void attack(StartCraft u); }