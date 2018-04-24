package proxy.test.staticProxy;

/**
 * <p>Description: []</p>
 * Created on: 2018/4/23
 *
 * @author dengjiang_v@didichuxing.com
 */

/**
 * 被代理对象实现
 */
public class MyObjectImpl implements MyObject {

    @Override
    public void execute() {
        System.out.println("This is MyObjectImpl");
    }
}
