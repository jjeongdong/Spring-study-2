package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(       //@Component가 붙은 클래스를 찾아 자동으로 스프링 빈으로 등록
        //basePackages = "hello.core.member",     //@Component를 찾는 경로를 지정, default값 -> package hello.core가 시작 위치
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)


public class AutoAppConfig {
//    수동 빈 등록과 자동 빈 등록이 충돌되면, 수동 빈 등록이 우선권을 가진다.
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
