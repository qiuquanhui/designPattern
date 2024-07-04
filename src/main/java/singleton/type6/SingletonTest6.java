package singleton.type6;

public class SingletonTest6 {
    public static void main(String[] args) {
        System.out.println("静态内部类，推荐使用");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}

//静态内部类完成单例模式
class Singleton{

    //1.私有化构造器
    private Singleton(){}

    //2.定义静态内部类
    private static class SinglentonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    //3.定义静态公共方法
    public static Singleton getInstance(){
        return SinglentonHolder.INSTANCE;
    }

}