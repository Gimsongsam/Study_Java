package ch9;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? "+(i==i2));

        // 래퍼 클래스들은 모두 equals()가 오버라이딩되어 있다.
        // 따라서 주소값이 아닌 객체가 가지고 있는 값을 비교한다.
        System.out.println("i.equals(i2) ? " + i.equals(i2));

        // compareTo() 함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수이다.
        System.out.println("i.compareTo(i2)="+i.compareTo(i2));
        System.out.println("i.toString()="+i.toString());

        // toString도 오버라이딩되어 있어 객체가 가지고 있는 값을 문자열로 변환하여 반환한다.
        System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
        System.out.println("SIZE="+Integer.SIZE+" bits");
        System.out.println("BYTES="+Integer.BYTES+" bytes");
        System.out.println("TYPE="+Integer.TYPE);
    }
}
