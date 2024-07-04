package singleton.type3;/**
 * 作者:灰爪哇
 * 时间:2024-07-04
 */

/**
 *
 *
 * @author: Hui
 **/
public class SingletonTest3 {
    
    public static void main(String[] args) {
          Singleton singleton =   Singleton.getInstance();
          Singleton singleton1 =   Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}

class Singleton{
    
    //1.构造器私有化
    private Singleton(){}
    
    //2.静态实例私有化
    private static Singleton singleton;

    //3.提供实例的静态方法
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
