package ch7;

interface Repairable{}

class Unit{
    int x, y;
//    abstract void move (int x, int y);
    void stop() { /* 현재 위치에 정지 */}

    int hitPoint;
//    final String name;
    final int MAX_HP;
    Unit(int hp){
        this.MAX_HP = hp;
//        this.name = name;
    }
}

public class StartCraft {

     static class Marine {   // 보병
        int x, y;       // 현재 위치

         String name = "Marin";

         // 이동하는 방법이 유닛별로 서로 달라서 move 메서드의 실제 구현 내용이 다를 것이다.
        void move(int x, int y) {
            System.out.println("move! move!");
        };
        void stop(){
            System.out.println("stop!");
        }
        void stimPack(){
            System.out.println("stimPack");
        }
    }

    static class Tank {  // 탱크
        int x, y;       // 현재 위치
        String name = "Tank";

        // 이동하는 방법이 유닛별로 서로 달라서 move 메서드의 실제 구현 내용이 다를 것이다.
        void move(int x, int y) {
            System.out.println("move! move!");
        };
        void stop(){
            System.out.println("stop!");
        }
        void changeMode(){
            System.out.println("changeMode");
        }
    }
    static class DropShip{
        int x, y;       // 현재 위치
        String name = "DropShip";

        // 이동하는 방법이 유닛별로 서로 달라서 move 메서드의 실제 구현 내용이 다를 것이다.
        void move(int x, int y) {
            System.out.println("move! move!");
        };
        void stop(){
            System.out.println("stop!");
        }
        void load(){
            System.out.println("load");
        }
        void unload(){
            System.out.println("unload");
        }
    }

}


class Marine {   // 보병
    int x, y;       // 현재 위치
    void move(int x, int y) {
        System.out.println("move! move!");
    };
    void stop(){
        System.out.println("stop!");
    }
    void stimPack(){
        System.out.println("stimPack");
    }
}
