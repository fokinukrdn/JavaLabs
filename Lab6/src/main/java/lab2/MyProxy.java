package lab2;
import javax.management.RuntimeErrorException;
import javax.management.RuntimeOperationsException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {

    private MyInterface object;

    public MyProxy(MyInterface object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")){
            System.out.println(method.getName() + " was called");}
        if (method.getName().startsWith("set")) {
            throw new IllegalAccessException("This is setter");
            //System.out.println("I was not called");

        }
        return method.invoke(object, args);
    }
}