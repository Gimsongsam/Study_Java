package ch9;

public class StringBufferEx2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb = "+sb);
        System.out.println("sb2= "+sb2);
        System.out.println("sb3= "+sb3);

        // 지정된 위치(index)의 문자를 제거한다.
        System.out.println("sb = "+sb.deleteCharAt(10));

        // 시작위치(start)부터 끝 위치(end)사이에 있는 문자를 제거한다.
        // 단, 끝 위치의 문자는 제외.
        System.out.println("sb = "+sb.delete(3,6));

        // 두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(pos)에 추가한다.
        // pos는 0부터 시작
        System.out.println("sb = " + sb.insert(3, "abc"));

        // 지정된 범위(start~end)의 문자열들을 주어진 문자열로 바꾼다.
        // end위치의 문자는 범위에 포함 되지 않는다.(start <= x < end)
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));

        // String Buffer 인스턴스의 버퍼크기를 알려준다.
        // length()는 버퍼에 담긴 문자열의 길이를 알려준다.
        System.out.println("capacity = "+ sb.capacity());

        // StringBuffer 인스턴스에 저장되어 있는 문자열의 길이를 반환한다.
        System.out.println("length = " + sb.length());

    }
}
