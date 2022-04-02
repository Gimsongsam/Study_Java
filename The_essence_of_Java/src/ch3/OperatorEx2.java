package ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++;    // i의 값을 참조 한 후에 i의 값을 증가 시켜 연산결과값을 변수 j에 저장한다.
        System.out.println("j=i++; 실행 후, i=" + i +"j="+ j);

        i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        j=0;

        j = ++i;    // i의 값을 증가 시킨 후에 값을 참조하여 변수 j에 연산결과값을 저장한다.
        System.out.println("j=++i; 실행 후, i=" + i + "j="+ j);
    }
}
