import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class MyProxy implements InvocationHandler {
    private Object target;

    public MyProxy(Object target){
        this.target=target;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException, InvocationTargetException {
        System.out.printf("%d.compareTo(%d) \r\n",target,args[0]);
        return method.invoke(target, args);
    }

    public static void main(String[] args) {
        Object[] elements=new Object[2000];      
        Class[] interfaces=new Class[]{Comparable.class};  
        for(int i=0;i<elements.length;i++){
            Integer val=i;
            InvocationHandler handler=new MyProxy(val);
            elements[i]=Proxy.newProxyInstance(null,interfaces , handler);
        }

        int key=new Random().nextInt(elements.length );
        int result=Arrays.binarySearch(elements, key);
        System.out.println(result);
    }
}