package ch8;

public class NewExceptionTest {
    public static void main(String[] args) {
        try{

        } finally {

        }
    }   // main
    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace())  // 충분한 설치 공간이 없으면
            throw new SpaceException("설치할 공간이 부족합니다.");
        if(!enoughMemory()) // 충분한 메모리가 없으면
            throw new MemoryException("메모리가 부족합니다.");
    }   // startInstall메서드의 끝

    static void copyFiles(){ /* 파일들을 복사하는 코드를 적는다. */ }
    static void deleteTempFiles(){/* 임시파일들을 삭제하는 코드를 적는다. */}

    static boolean enoughSpace(){
        // 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }

    static boolean enoughMemory(){
        // 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }
}   // NewExceptionTest클래스의 끝

class SpaceException extends Exception{
    SpaceException(String msg){
        super(msg);
    }
}
class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}
