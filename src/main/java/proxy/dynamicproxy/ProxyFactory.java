package proxy.dynamicproxy;/**
 * 作者:灰爪哇
 * 时间:2024-07-09
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  代理工厂
 *
 * @author: Hui
 **/
public class ProxyFactory {

    private Object target;

    //构造器
    public ProxyFactory(Object target){
        this.target = target;
    }

    //获取代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始代理");
                Object resultVal = method.invoke(target, args);
                System.out.println("结束代理");
                return resultVal;
            }
        });
    }
}
