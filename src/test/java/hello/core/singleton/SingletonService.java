package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // new SingletonService()로 호출할 수 없도록 막음
    private SingletonService() {}

    public void logic() {
        System.out.println("싱글톤 로직을 호출");
    }
}
