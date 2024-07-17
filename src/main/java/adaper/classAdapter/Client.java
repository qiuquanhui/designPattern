package adaper.classAdapter; /**
 * 作者:灰爪哇
 * 时间:2024-07-17
 */

/**
 *  客户端
 *
 * @author: Hui
 **/
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        String s = adapter.method1();
        System.out.println(s);
    }

}
