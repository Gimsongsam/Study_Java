package ch9;

import java.util.StringJoiner;

// 문자 인코딩 변환
public class StringEx5 {
    public static void main(String[] args) throws Exception {
        String str = "가";

        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949");
    }

    static String joinByteArr(byte[] bArr){
        StringJoiner sj = new StringJoiner(":", "[","]");

        for(byte b : bArr)
            sj.add(String.format("%02X",b));
        return sj.toString();
    }
}

