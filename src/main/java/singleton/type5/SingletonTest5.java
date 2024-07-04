package singleton.type5;/**
 * 作者:灰爪哇
 * 时间:2024-07-04
 */

/**
 * @author: Hui
 **/
public class SingletonTest5 {
    public static void main(String[] args) {
        System.out.println("双重检查锁，推荐使用");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}

class Singleton {

    //1.私有化构造器
    private Singleton() {
    }

    //2.声明静态变量，volatile 保证内存的可见性
    private static volatile Singleton instance;

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                //双重检查锁
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}