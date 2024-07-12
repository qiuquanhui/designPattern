package proxy.staticproxy;/**
 * 作者:灰爪哇
 * 时间:2024-07-09
 */

/**
 *  代理对象
 *
 * @author: Hui
 **/
public class TeacherProxy implements ITeacher{

    private ITeacher iteacher;

    public TeacherProxy(ITeacher teacher) {
        this.iteacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("代理对象  开始");
        iteacher.teach();
        System.out.println("代理对象  结束");
    }
}
