package factory.simpleFactory;/**
 * 作者:灰爪哇
 * 时间:2024-07-01
 */

/**
 *
 *
 * @author: Hui
 **/
public class SimpleFactory {

    public Person getPerson(String type){
        if (type == null){
            return null;
        }

        if("man".equals(type)){
            return new Man();
        }else if("student".equals(type)){
            return new Student();
        }else if("lady".equals(type)){
            return new Lady();
        }else{
            return null;
        }
    }

}
