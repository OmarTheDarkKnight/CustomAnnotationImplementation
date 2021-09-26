import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AppendStrImpl {
    public void changeFields(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(AppendStr.class)) {
                // get the getter method name from the field name
                String fieldName = field.getName();
                String getterMethodName =
                        "get" +
                        fieldName.substring(0, 1).toUpperCase() +
                        fieldName.substring(1);
                Method getterMethod = clazz.getMethod(getterMethodName);
                String returnValue = (String) getterMethod.invoke(object);

                String setterMethodName = getterMethodName.substring(0, 1).replace("g", "s")
                        + getterMethodName.substring(1);
                Method setterMethod = clazz.getMethod(setterMethodName, String.class);
                setterMethod.invoke(object, returnValue + getAppendingString(field));
                System.out.println((String) getterMethod.invoke(object));
            }
        }
    }

    private String getAppendingString(Field field) {
        return field.getAnnotation(AppendStr.class)
                .str();
    }
}
