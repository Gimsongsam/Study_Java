package ch2;

public class printfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f;   // 0.10, 1.0e-1
        float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f1=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f1=%f, %e, %g%n", f3, f3, f3);

        // %f는 기본적으로 소수점 아래 6자리까지만 출력하기 때문에 소수점 아래 7자리에서 반올림
        System.out.printf("d=%f%n", d);       // 1.234568
        System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점을 10자리로 만들어라

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);  // 왼쪽 정렬
        System.out.printf("[%.8s]%n", url);   // 왼쪽에서 8글자만 출력
    }
}
