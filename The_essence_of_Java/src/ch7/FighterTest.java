package ch7;

public class FighterTest {
    public static void main(String[] args) {

    }
}

class Fighter extends Unit implements Fightable{
    public void move(int x, int y){/* 내용 생략 */}
    public void attack(Unit u) { /* 내용 생략 */ }
}

interface Fightable extends Movable, Attackable{}
interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }