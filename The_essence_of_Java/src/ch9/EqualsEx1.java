package ch9;

public class EqualsEx1 {
    public static void main(String[] args) {
        Value i1 = new Value(10);
        Value i2 = new Value(10);

        Value s1 = new Value("abc");
        Value s2 = new Value("abc");

        String ss1 = new String("abc");
        String ss2 = new String("abc");

        if(i1.equals(i2))
            System.out.println("i1과 i2는 같습니다.");
        else
            System.out.println("i1과 i2는 다릅니다.");
        if(s1.equals(s2))
            System.out.println("s1과 s2는 같습니다.");
        else
            System.out.println("s1과 s2는 다릅니다.");
        if(ss1.equals(ss2))
            System.out.println("ss1과 ss2는 같습니다.");
        else
            System.out.println("ss1과 ss2는 다릅니다.");

        i2 = i1;
        s2 = s1;
        System.out.println();

        if(i1.equals(i2))
            System.out.println("i1과 i2는 같습니다.");
        else
            System.out.println("i1과 i2는 다릅니다.");
        if(s1.equals(s2))
            System.out.println("s1과 s2는 같습니다.");
        else
            System.out.println("s1과 s2는 다릅니다.");
        if(ss1.equals(ss2))
            System.out.println("ss1과 ss2는 같습니다.");
        else
            System.out.println("ss1과 ss2는 다릅니다.");

    }// main
}

class Value{
    int intValue;
    String strValue;

    Value(int intValue){
        this.intValue = intValue;
    }

    Value(String strValue){
        this.strValue = strValue;
    }
}
