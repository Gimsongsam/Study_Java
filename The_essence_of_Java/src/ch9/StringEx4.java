package ch9;

// join()은 여러 문자열 사이에 구분자를 넣어서 결합한다.

import java.util.StringJoiner;

public class StringEx4 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/","[","]");
        for(String s: arr)
            sj.add(s);

        System.out.println(sj.toString());

    }
}
