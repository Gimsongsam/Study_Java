package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


// 1. TEST 클래스 -> 2. 구현 : TDD(테스트 주도개발)

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // test 하나가 끝날 때 마다 공용 데이터를 클리어해야한다.
    // 서로 의존 관계가 없이 실행이 되어야한다.
    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();

        // 기대값과 실제값을 비교해보는 로직
        //  System.out.println("result = " + (result == member));
//        Assertions.assertEquals(result, member); // 위 코드 대신 assert를 사용할 수 있다.
        assertThat(member).isEqualTo(result);

    }

    @Test
    public void findbyName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();
        assertThat(member1).isEqualTo(result);

        Member result2 = repository.findByName("spring2").get();
        assertThat(member2).isEqualTo(result2);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("test");
        repository.save(member1);

//        String result1 = member1.getName();
//        System.out.println("member1: " + result1);


        Member member2 = new Member();
        member2.setName("test2");
        repository.save(member2);

//        String result2 = member2.getName();
//        System.out.println("member2: " + result2);


        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }
}
