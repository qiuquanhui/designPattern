package factory.absFactory;/**
 * 作者:灰爪哇
 * 时间:2024-07-02
 */

/**
 * 具体工厂 2
 *
 * @author: Hui
 **/
public class ConcreteFactory2 extends AbsFactory{
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
