package practice;

class Users {
    final String userId;
    static int seq;

    Users(String userId){
        this.userId = userId;
        seq++;
    }
}


public class FinalTest {
    public static void main(String[] args){
        Users u1 = new Users("test1");

        System.out.println(u1.userId);
        System.out.println(Users.seq);

        System.out.println();

        Users u2 = new Users("test2");
        System.out.println(u2.userId);
        System.out.println(Users.seq);
    }
}
