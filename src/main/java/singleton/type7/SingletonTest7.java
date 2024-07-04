package singleton.type7;

public class SingletonTest7 {
    public static void main(String[] args) {
        System.out.println("通过枚举完成单例模式，推荐使用");
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;;
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());

        singleton.doSomething();
    }
}

//通过枚举完成单例模式
enum Singleton{
    INSTANCE;

    public void doSomething(){
        System.out.println("hello world");
    }
}