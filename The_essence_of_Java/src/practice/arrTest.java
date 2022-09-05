package practice;

import java.util.Arrays;

public class arrTest {
    public static void main(String[] args) {
        String[] str = {"a","b","c","d"};

        String str2 = "abcdf";

//        System.out.println(str2.indexOf("d"));

        String search = "c";
        for(int i=0; i<str2.length(); i++){

            char j = str2.charAt(i);
            String jj = String.valueOf(j);

            if( jj.equals(search)){
                System.out.println("Search: " + str2.charAt(i));

                break;
            }
        }


        // index of
        System.out.println("Search: " + Arrays.asList(str).indexOf("c"));


    }



}
