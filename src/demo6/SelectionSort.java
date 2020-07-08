package demo6;

/**
 * User: van
 * Date: 2020-06-12
 * Time: 09:43
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            int random = (int) (Math.random() * 1000);
            a[i] = random;
        }
//        selectionSortOne(a);
        selectionSortTwo(a);





    }

    private static void selectionSortOne(int a[]) {
        long first = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        long second = System.currentTimeMillis();
        System.out.println(second - first);
        printArrays(a);
    }

    private static void selectionSortTwo(int a[]) {

        long first = System.currentTimeMillis();

        for (int i = 0; i < a.length - i; i++) {

            int min = i;
            int max = i;
            for (int j = i; j < a.length - i; j++) {

                if (a[min] > a[j]) {
                    min = j;
                }
                if (a[max] < a[j]) {
                    max = j;
                }
            }
            if (min != max) {

                int maxTemp = a[a.length - i - 1];
                a[a.length - i - 1] = a[max];
                a[max] = maxTemp;

                int temp = a[i];
                if (a[i] > a[min]) {
                    a[i] = a[min];
                    a[min] = temp;
                }
            }
        }
        long second = System.currentTimeMillis();
        System.out.println(second - first);
        printArrays(a);
    }


    private static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "、");
        }
        System.out.println();
    }
}
