package hello.core.order;

import hello.core.AutoAppConfig;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        Member member = new Member(1L, "정동훈", Grade.VIP);
        memberRepository.save(member);

        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());

        Order order = orderService.createOrder(1L, "itemA", 20000);
        Assertions.assertThat(order.getMemberId()).isEqualTo(1L);
    }
}