package proxy.cglibproxy;/**
 * 作者:灰爪哇
 * 时间:2024-07-09
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  代理工厂
 *
 * @author: Hui
 **/
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public Object getProxyInstance(Object obj){
        this.target = obj;
        //1.创建工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(obj.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        Object proxyObj = enhancer.create();
        //返回代理对象
        return proxyObj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始");
        Object resultVal = method.invoke(target, objects);
        System.out.println("cglib代理结束");
        return resultVal;
    }
}
