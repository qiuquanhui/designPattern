package factory.factoryMethod;/**
 * 作者:灰爪哇
 * 时间:2024-07-01
 */

/**
 *
 *
 * @author: Hui
 **/
public class CreateFactory1 extends Factory{

    @Override
    public Product createProduct() {
        return new Product1();
    }
}
