package proxy.dynamicproxy;/**
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

        ITeacher teacherDao = new TeacherDao();
        // 创建代理对象
        ITeacher proxyFactory = (ITeacher) new ProxyFactory(teacherDao).getProxyInstance();

        proxyFactory.teach();
    }
}
