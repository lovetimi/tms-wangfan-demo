package demo6;

/**
 * User: van
 * Date: 2020-06-11
 * Time: 14:12
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] a = new int[]{9, 2, 7, 8, 5, 6, 3, 4, 1};
        for (int i = a.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                int temp1 = a[j];
                int temp2 = a[j + 1];
                a[j] = temp1 > temp2 ? temp2 : temp1;
                a[j + 1] = temp1 > temp2 ? temp1 : temp2;
                printArrays(a);
            }
        }

    }

    private static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "、");
        }
        System.out.println();
    }

}
