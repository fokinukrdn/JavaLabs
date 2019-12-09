package lab2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;


public class Main {

    public static void main(String[] args) throws InvocationTargetException {


        Triangle triangle = new Triangle(3, 4, 5);
//        z.setA(6);
//        z.setB(8);
//        z.setC(10);
        System.out.println("Square = "+triangle.square());
        System.out.println(triangle.toString());

        Quadrangle quadrangle = new Quadrangle(5, 4, 3, 6, 12);
        System.out.println("Square "+ quadrangle.square());
        System.out.println(quadrangle.toString());



        StringBuilder sb = new StringBuilder("\n List of methods: \n");
        for (Method m : Triangle.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Annotation.class)) {
                Annotation com = m.getAnnotation(Annotation.class);
                sb.append("Method: " + m.getName()).append(" | Name: " + com.name()).append(" | ").append("Arguments:" + com.args()).append(" | ").append("Description:" + com.desc()).append("\n");
            }
        }
        System.out.println(sb.toString());


        sb = new StringBuilder("\n List of fields: \n");
        for (Field field : triangle.getClass().getDeclaredFields()) {
            sb.append("Field: " + field.getName()).append(" | Name:" + field.getName()).append(" | ").append("Type:" + field.getType()).append(" | ").append("Access modifiers:" + field.getModifiers()).append("\n");
        }
        System.out.println(sb.toString());



        sb = new StringBuilder(" ");
        System.out.println("\n Call methods\n");
        try {
            for (Method m : triangle.getClass().getDeclaredMethods()) {
                if (m.isAnnotationPresent(Annotation.class) && m.getParameterTypes().length == 0) {
                    Object result1 = m.invoke(triangle);
                    sb.append(result1);
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }



        MyProxy handler = new MyProxy(quadrangle);
        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class[]{MyInterface.class},
                handler);
        try {
            System.out.println(proxy.getD());
            proxy.setD(12);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
