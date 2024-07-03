package factory.simpleFactory;/**
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
        SimpleFactory simpleFactory = new SimpleFactory();

        Person person = simpleFactory.getPerson("man");
        person.action();

        person = simpleFactory.getPerson("lady");
        person.action();

        person = simpleFactory.getPerson("student");
        person.action();

        person = simpleFactory.getPerson("teacher");
        if (person == null){
            System.out.println("没有这个类型");
        }

    }
}
