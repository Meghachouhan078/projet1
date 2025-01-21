package ExceptionHandling;

import java.lang.reflect.Method;

public class compiletime1 {
    public static void main(String[] args) {
        try {
            Method method = String.class.getMethod("nonexistentMethod");
        } catch (NoSuchMethodException e) {
           // System.out.println("NoSuchMethodException occurred: " + e.getMessage());
        }
    }
}

