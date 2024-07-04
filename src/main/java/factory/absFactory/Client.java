package factory.absFactory;/**
 * 作者:灰爪哇
 * 时间:2024-07-02
 */

/**
 * 客户端
 *
 * @author: Hui
 **/
public class Client {

    public static void main(String[] args) {
        AbsFactory factory = new ConcreteFactory1();
        System.out.println("产品1 ~~~ ");
        factory.createProductA().use();
        factory.createProductB().use();

        factory = new ConcreteFactory2();
        System.out.println("产品2 ~~~ ");
        factory.createProductA().use();
        factory.createProductB().use();


    }
}
