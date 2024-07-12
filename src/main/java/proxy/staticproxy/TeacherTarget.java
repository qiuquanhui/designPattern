package proxy.staticproxy;/**
 * 作者:灰爪哇
 * 时间:2024-07-09
 */

/**
 *  目标对象
 *
 * @author: Hui
 **/
public class TeacherTarget implements ITeacher{
    @Override
    public void teach() {
        System.out.println(" 老师开始授课了 ~~~~");
    }
}
