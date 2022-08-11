package practice;

interface Study{
    public static final String language = "Java";

    // 원래 인터페이스의 모든 메서드는 추상메서드이어야 한다.
    // JDK1.8부터 인터페이스에 static메서드와 디폴트 메서드의 추가를 허용하는 방향으로 변경되었다.
    String language2 = "JavaScript";
//    public abstract springBoot(String l);
    public abstract String SpringBoot();
}

class StudyTest implements Study{
    @Override
    public String SpringBoot() {
        return null;
    }

}



public class InterfaceTest{
    static void main (String[] args){

    }
}

