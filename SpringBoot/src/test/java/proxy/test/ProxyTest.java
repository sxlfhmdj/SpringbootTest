package proxy.test;


import proxy.test.subClassProxy.ProxyFactory;
import proxy.test.staticProxy.MyObject;
import proxy.test.staticProxy.MyObjectImpl;
import proxy.test.staticProxy.MyObjectProxy;

/**
 * 代理测试类
 */
public class ProxyTest {

    public static void main(String[] args) {
        MyObjectProxy staticProxy = new MyObjectProxy(new MyObjectImpl());
        staticProxy.execute();

        System.out.println("----Dynamic Proxy----");
        MyObjectImpl target = new MyObjectImpl();
        System.out.println(target.getClass());
        MyObjectImpl dynamicProxy = (MyObjectImpl)new ProxyFactory(target).getProxyInstance();
        System.out.println(dynamicProxy.getClass());
        dynamicProxy.execute();
    }



}
