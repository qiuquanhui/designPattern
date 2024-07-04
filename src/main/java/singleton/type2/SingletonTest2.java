package singleton.type2;/**
 * 作者:灰爪哇
 * 时间:2024-07-04
 */

/**
 * @author: Hui
 **/
public class SingletonTest2 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }

}

class Singleton {

    //1.私有化构造方法
    private Singleton() {
    }

    //2.创建一个静态对象
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    //3.创建一个静态返回实例方法
    public static Singleton getInstance() {
        return instance;
    }
}