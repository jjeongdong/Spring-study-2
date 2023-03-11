package hello.core.member;

public interface MemberRepository {
     void save(Member member);

     Member findById(Long memberId);

     //interface만으로는 동작하지 않으므로 구현체를 만들어야함
}
