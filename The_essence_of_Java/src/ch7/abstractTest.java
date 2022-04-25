package ch7;

public class abstractTest {
    public static void main(String[] args) {
        // Player p = new Player();  --> 이렇게 사용하려면 Player 클래스가 abstract가 아니어야 한다.

        Player.CDPlayer cd =  new Player.CDPlayer(); // 완성한 자손 클래스를 호출
        cd.nextTrack();
        System.out.println("현재 재생 번호: " + cd.currentTractk);

        System.out.println();

        cd.nextTrack();
        System.out.println("현재 재생 번호: " + cd.currentTractk);
    }
}

abstract class Player{  // 자손 클래스가 조상 클래스를 완성하도록 강조
    boolean pause;      // 일시정지 상태를 저장하기 위한 변수
    int currentPos;     // 현재 play되고 있는 위치를 저장하기 위한 변수

    Player(){           // 추상클래스도 생성자가 있어야 한다.
        pause = false;
        currentPos = 0;
    }
    /** 지정된 위치(pos)에서 재생을 시작하는 기능이 수행하도록 작성되어야 한다. */
    // void play(int pos){};
    abstract void play(int pos); // 추상메서드는 몸통이 없다.

    /** 재생을 즉시 멈추는 기능을 수행하도록 작성되어야 한다. */
    //void stop(){};
    abstract void stop(); // 추상메서드

    void play(){
        play(currentPos);           // 추상메서드를 사용할 수 있다.
    }

    void pause(){
        if(pause) { // pause가 true일 때 (정지상태)에서 pase가 호출되면,
            pause = false;
            play(currentPos);   // 현재의 위치에서 play한다.
        }else{  // pause가 false일 때(play상태)에서 pase가 호출되면,
            pause = true;       // pause의 상태를 true로 바꾸고
            stop();             // play를 멈춘다.
        }
    }

    static class CDPlayer extends Player{
        void play(int currentPos){
            /* 조상의 추상메서드를 구현. 상세 내용 생략 */
            System.out.println("play");
        }

        void stop(){
            /* 조상의 추상메서드를 구현. 상세 내용 생략 */
            System.out.println("stop");
        }

        // CDPlayer클래스에 추가로 정의된 멤버
        int currentTractk;  // 현재 재생 중인 트랙

        void nextTrack(){
            currentTractk++;
                // ...
        }

        void preTrack(){
            if(currentTractk > 1){
                currentTractk--;
            }

            // ...
        }

    }


}
