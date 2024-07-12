package proxy.cglibproxy;/**
 * 作者:灰爪哇
 * 时间:2024-07-09
 */


/**
 *  客户端
 *
 * @author: Hui
 **/
public class Client {
    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory();

        TeacherTarget teacherProxy =(TeacherTarget) proxyFactory.getProxyInstance(new TeacherTarget());

        teacherProxy.teach();

    }
}
