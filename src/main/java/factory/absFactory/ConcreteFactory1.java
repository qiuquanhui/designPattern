package factory.absFactory;/**
 * 作者:灰爪哇
 * 时间:2024-07-02
 */

/**
 * 具体工厂 1
 *
 * @author: Hui
 **/
public class ConcreteFactory1 extends AbsFactory{
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
