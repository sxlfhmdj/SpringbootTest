package proxy.test.staticProxy;

/**
 * <p>Description: []</p>
 * Created on: 2018/4/23
 *
 * @author dengjiang_v@didichuxing.com
 */
public class MyObjectProxy implements MyObject {

    private MyObjectImpl myObject;

    public MyObjectProxy(MyObjectImpl myObject) {
        this.myObject = myObject;
    }

    @Override
    public void execute() {
        System.out.println("This is MyObjectProxy");
        myObject.execute();
    }
}
