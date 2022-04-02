package ch2;

public class printfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // long big = 1000000000000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;   // 8진수 10, 10진수로는 8
        int hexNum = 0x10;  // 16진수 10, 10진수로는 16
        int binNum = 0b10;  // 2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        // 자바에서는 char타입의 값을 지시자 '%d'로 출력할 수 없다. int타입으로 형변환해야만 출력가능
        System.out.printf("c=%c, %d, %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);  // '#'은 접두사(16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        // 10진수를 2진수로 출력해주는 지시자는 없기 때문에, 정수를 2진 문자열로 변환해주는 Integer.toBinaryString를 사용
        // 정수를 2진수로 변환해서 문자열로 반환
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}
