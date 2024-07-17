package adaper.classAdapter; /**
 * 作者:灰爪哇
 * 时间:2024-07-17
 */

/**
 *  被适配者
 *
 * @author: Hui
 **/
public class Adaptee {

    public String method(){
        System.out.println("调用被适配者方法");
        return "被适配者方法";
    }

}
