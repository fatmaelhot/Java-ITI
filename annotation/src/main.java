import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@interface Author {
    String value() default "";
}

@Author("fatma")
class AnnotatedClass {

    @Author("mohammed")
    private String annotatedField;

    @Author("mahmoud")
    public AnnotatedClass() {
        // Constructor code
    }

    @Author("ahmed")
    public void annotatedMethod() {
        // Method code
    }
}

public class main {
    public static void main(String[] args) {
        Class<?> annotatedClass = AnnotatedClass.class;

        // Get class-level annotation
        Author classAnnotation = annotatedClass.getAnnotation(Author.class);
        if (classAnnotation != null) {
            System.out.println("Class Author: " + classAnnotation.value());
        }

        // Get method-level annotation
        Method[] methods = annotatedClass.getDeclaredMethods();
        for (Method method : methods) {
            Author methodAnnotation = method.getAnnotation(Author.class);
            if (methodAnnotation != null) {
                System.out.println("Method " + method.getName() + " Author: " + methodAnnotation.value());
            }
        }

        // Get constructor-level annotation
        Constructor<?>[] constructors = annotatedClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            Author constructorAnnotation = constructor.getAnnotation(Author.class);
            if (constructorAnnotation != null) {
                System.out.println("Constructor Author: " + constructorAnnotation.value());
            }
        }

        // Get field-level annotation
        Field[] fields = annotatedClass.getDeclaredFields();
        for (Field field : fields) {
            Author fieldAnnotation = field.getAnnotation(Author.class);
            if (fieldAnnotation != null) {
                System.out.println("Field " + field.getName() + " Author: " + fieldAnnotation.value());
            }
        }
    }
}
