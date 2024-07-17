package adaper.classAdapter; /**
 * 作者:灰爪哇
 * 时间:2024-07-17
 */

/**
 *  适配器
 *
 * @author: Hui
 **/
public class Adapter extends Adaptee implements ITarget{


    @Override
    public String method1() {

        //适配器方法，将原有的方法进行适配
        System.out.println("调用适配器方法");
        String adapteeMenthod = method();
        System.out.println("将被适配器方法进行调整");
        adapteeMenthod = adapteeMenthod.replaceAll("被适配者方法","适配器方法");
        System.out.println("调整成功");
        return adapteeMenthod;
    }
}
