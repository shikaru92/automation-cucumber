package cucumber.pageobject;

/**
 * Created by tcbinh on 3/4/2016.
 */
public class UserData {
    public static String name;
    public static int age;

    public static void setAge(int age) {
        UserData.age = age;
    }

    public static void setName(String name) {
        UserData.name = name;
    }
}
