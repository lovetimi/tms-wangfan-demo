package demo4;

/**
 * User: van
 * Date: 2020-06-10
 * Time: 15:56
 */
public class RecursiveDemo {

    public static void main(String[] args) {
        tailStack(1);
    }


    public static int tailStack(int i) {
        int result = i + 1;
        if (result > 100000)
            return result;
        else
            return tailStack(result);
    }
}
