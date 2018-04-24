package proxy.test.staticProxy;

/**
 * 被代理对象实现
 */
public class MyObjectImpl implements MyObject {

    @Override
    public void execute() {
        System.out.println("This is MyObjectImpl");
    }
}
