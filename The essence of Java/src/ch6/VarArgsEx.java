package ch6;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};
        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("["+concatenate(",")+"]");
    }

    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args){
            result += str + delim;
        }

        return result;
    }

    // 두 오버로딩된 메서드가 구분되지 않는다.
    // 가변인자를 사용한 메서드는 오버로딩하지 않는 것이 좋다.
    /*
        static String concatenate(String... args){
            return concatenate("", args);
        }
    */
} // class
