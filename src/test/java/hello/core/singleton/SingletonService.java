package hello.core.singleton;

public class SingletonService {

    //static -> static 영역에 하나만 생성
    private static final SingletonService instance = new SingletonService();

    //public으로 열어서 객체 인스턴스가 필요하면 이 메소드를 통해서만 조회되도록 허용
    public static SingletonService getInstance() {
        return instance;
    }

    //생성자를 private으로 선언하여 외부에서 new를 활용하여 객체 생성하는 것을 방지
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱들톤 객체 로직 호츌");
    }

}
