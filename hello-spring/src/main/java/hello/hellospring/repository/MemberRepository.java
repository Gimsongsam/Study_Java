package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;



// 회원 리포지토리 인터페이스
public interface MemberRepository {

    Member save(Member member);

    // null을 처리해주는 방법으로 Optional을 사용한다.
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);

    // 저장된 모든 회원 리스트를 반환
    List<Member> findAll();
}
