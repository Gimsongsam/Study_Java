package ch7;

abstract class Unit{
    int x, y;
    abstract void move (int x, int y);
    void stop() { /* 현재 위치에 정지 */}
    String name;

    int currentHP;  // 유닛의 체력
}


public class StartCraft {

     static class Marine extends Unit {   // 보병
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

    static class Tank extends Unit {  // 탱크
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

    static class DropShip extends Unit{
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


    static class Test{

        static class StaticTest{

        }
//        class InstanceTest{   // ??
//
//        }
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
