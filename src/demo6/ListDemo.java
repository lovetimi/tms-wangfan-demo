package demo6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * User: van
 * Date: 2020-06-30
 * Time: 09:18
 */
public class ListDemo {
    public static void main(String[] args) {
        User[] a = new User[]{new User("a", "a", 3)};
        List<User> lt = Arrays.asList(a);
        List<User> ddd = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            ddd.add(a[i]);
        }
        a[0] = new User("a", "b", 4);
        System.out.println("-----new ArrayList----");
        for (User user : ddd) {
            System.out.println(user);
        }
        System.out.println("----原数组-----");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            ddd.add(a[i]);
        }

        System.out.println("-----Arrays.asList()----");
        for (User ss : lt) {
            System.out.println(ss);
        }

    }
}
