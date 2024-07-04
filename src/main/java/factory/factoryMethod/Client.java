package factory.factoryMethod;/**
 * 作者:灰爪哇
 * 时间:2024-07-01
 */

/**
 *
 *
 * @author: Hui
 **/
public class Client {

    public static void main(String[] args) {

        Factory factory = new CreateFactory1();

        factory.createProduct().use();

    }
}
