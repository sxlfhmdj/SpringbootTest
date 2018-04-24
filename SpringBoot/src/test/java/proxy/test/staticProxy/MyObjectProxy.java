package proxy.test.staticProxy;

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
