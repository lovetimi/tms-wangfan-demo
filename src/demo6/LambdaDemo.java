package demo6;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

/**
 * User: van
 * Date: 2020-06-23
 * Time: 15:45
 */
public class LambdaDemo {

    public static void main(String[] args) {

        User user1 = new User("33333", "3333", 30);
        User user2 = new User("11111", "1111", 10);
        User user3 = new User("55555", "5555", 50);
        User user4 = new User("22222", "2222", 20);
        User user5 = new User("44444", "4444", 40);

        List<User> users = new ArrayList<User>();


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        users.forEach(user -> {
            System.out.print(user.getName());
            System.out.print("-");
            System.out.println(user.getAge());
        });

        users.forEach(System.out :: println);

    }

}
