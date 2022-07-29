package ch8;

public class ChainedExceptionEx {

    public static void main(String[] args) {
        try{
            install();
        }catch(InstallException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }   // main

static void install() throws InstallException{
        try{
            startInstall();     // 프로그램 설치에 필요한 준비를 한다.
            copyFiles();        // 파일들을 복사한다.
        } catch (SpaceException e){
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException me){
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();    // Garbage Coolection을 수행하여 메모리를 늘려준다.
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();  // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } // try의 끝
    }   // install

    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace())  // 충분한 설치 공간이 없으면
            throw new SpaceException("설치할 공간이 부족합니다.");
        if(!enoughMemory()) // 충분한 메모리가 없으면
            throw new MemoryException("메모리가 부족합니다.");
        // throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
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

class InstallException extends Exception{
    InstallException(String msg){
        super(msg);
    }
}

//class SpaceException extends Exception{
//    SpaceException(String msg){
//        super(msg);
//    }
//}
//class MemoryException extends Exception{
//    MemoryException(String msg){
//        super(msg);
//    }
//}

