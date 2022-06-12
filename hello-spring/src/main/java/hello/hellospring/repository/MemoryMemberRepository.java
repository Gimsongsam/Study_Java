package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

// 회원 레포지토리 메모리 구현
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    int 변수이름[] = new int[5];
    int[] 변수이름2 = new int[4];
    boolean flag = false;

//    Map store3 = new Map();
    HashMap store4 = new HashMap();


    Map store5 = new TreeMap();
    Map store2 = new HashMap();

    @Override
    public Member save(Member member) {
        // id 값 셋팅
        member.setId(++sequence);
        store.put(member.getId(), member);

        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        // 결과값이 null이 반환될 가능성이 있으므로 Optional.ofNullable 로 감싸줌
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name)) // param에 넘어온 값과 같은지 비교
                .findAny(); // 결과값 없으면 null 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }
}
