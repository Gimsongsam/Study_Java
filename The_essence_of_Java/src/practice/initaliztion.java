package practice;

public class initaliztion {
    int a;

    // 초기화 블럭
    {
        a++;
    }

    static {

    }


    public static void main(String[] args) {
        initaliztion soutA1 = new initaliztion();
        initaliztion soutA2 = new initaliztion();

        // 인스턴스는 생성될때 마다 초기화
        System.out.println(soutA1.a);
        System.out.println(soutA2.a);
    }
}
