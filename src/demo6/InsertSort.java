package demo6;

/**
 * User: van
 * Date: 2020-06-15
 * Time: 14:09
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] a = new int[20];
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 10);
            a[i] = random;
        }

        for (int i = 1; i < a.length; i++) {

            int current = a[i];
            int seq = i;
            while (seq > 0) {
                int temp = a[seq - 1];
                if (current >= temp) {
                    break;
                } else {
                    a[seq - 1] = current;
                    a[seq] = temp;
                }
                seq--;
            }
        }
        printArrays(a);

    }

    private static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "、");
        }
        System.out.println();
    }


}
