package ch9;

public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        // fullName에서 '.'의 위치를 찾는다.
        int index = fullName.indexOf('.');

        // fullName의 첫번째 글자부터 '.'이 있는 곳까지 문자열을 추출한다.
        String fileName = fullName.substring(0, index);

        // '.'의 다음 문자 부터 시작해서 문자열의 끝까지 추출한다.
        // fullName.substring(intdex+1, fullName.length());의 결과와 같다.
        String ext = fullName.substring(index+1);

        System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
        System.out.println(fullName + "의 확장자는 " + ext);
    }
}
// substring(int start, int end)를 사용할 때 주의해야할 점은
// 1. 매개변수로 사용되는 문자열에서 각 문자의 위치를 뜻하는 index가 0부터 시작한다.
// 2. start부터 end의 범위 중 end 위치에 있는 문자는 결과에 포함되지 않는다.