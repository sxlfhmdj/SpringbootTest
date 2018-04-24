package proxy.test.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>Description: []</p>
 * Created on: 2018/4/23
 *
 * @author dengjiang_v@didichuxing.com
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("This is getProxyInstance");
                        Object returnValue = method.invoke(target, args);
                        return returnValue;
                    }
                });
    }

}
