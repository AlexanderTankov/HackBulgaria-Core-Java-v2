package Problem2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyJUnit {
    
    @Before (priority = 2)
    public void funcBefore2() {
        System.out.println("the second before function");
    }
    
    @Before(priority = 3)
    public void funcBefore () {
        System.out.println("before function");
    }
    
    @Execute()
    public static void funcExecute() {
        System.out.println("executing function");
    }
    
    @Execute()
    public static void funcExecute2() {
        System.out.println("executing function222222222222");
    }

    @After( priority = 2) 
    public void funcAfter() {
        System.out.println("after function");
    }
    
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        MyJUnit test = new MyJUnit();
        
        Method[] methods = test.getClass().getDeclaredMethods();
        
        List<Method> before = new ArrayList<Method>();
        List<Method> execute = new ArrayList<Method>();
        List<Method> after = new ArrayList<Method>();
        
        for ( Method m : methods) {
            if (m.isAnnotationPresent(Before.class))
                before.add(m);
            if (m.isAnnotationPresent(Execute.class))
                execute.add(m);
            if (m.isAnnotationPresent(After.class))
                after.add(m);
          }
        
     Comparator<Method> c = new Comparator<Method>() {

        @Override
        public int compare(Method o1, Method o2) {
            if(o1.getAnnotation(Before.class).annotationType().equals(Before.class)) {
                Before left = (Before) o1.getAnnotation(Before.class);
                Before right = (Before) o2.getAnnotation(Before.class);
                if (left.priority() > right.priority()) {
                    return 1;
                }
                if (left.priority() == right.priority()) {
                    return 0;
                }
                return -1;
            } else if (o1.getAnnotation(Before.class).annotationType().equals(After.class)) {
                After left = (After) o1.getAnnotation(Before.class);
                After right = (After) o2.getAnnotation(Before.class);
                if (left.priority() > right.priority()) {
                    return 1;
                }
                if (left.priority() == right.priority()) {
                    return 0;
                }
                return -1;
            }
            return 0;
        }
    };   
        
    Collections.sort(before, c);
    Collections.sort(after, c);
     
     List <Method> doIt = new ArrayList<Method>();
     for ( Method e : execute) {
         doIt.addAll(before);
         doIt.add(e);
         doIt.addAll(after);
     }
     
     for ( Method d: doIt) {
         d.invoke(test);
     }
    }
}