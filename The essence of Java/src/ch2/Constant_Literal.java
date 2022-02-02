package ch2;

public class Constant_Literal {
    public static void main(String[] args) {
        final int WIDTH = 20; // 폭
        final int HEIGHT = 10; // 높이

        int triangleArea = (WIDTH * HEIGHT) / 2; // 삼각형의 면적을 구하는 공식
        int rectangleArea = WIDTH * HEIGHT;      // 사각형의 면적을 구하는 공식
    }
}