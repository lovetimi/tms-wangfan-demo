package demo6;

/**
 * User: van
 * Date: 2020-06-15
 * Time: 15:52
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] a = new int[20];
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 10);
            a[i] = random;
        }

        printArrays(a);
        quickSort(a, 0, a.length - 1);

    }

    private static void quickSort(int[] a, int leftIdx, int rightIdx) {

        if (rightIdx >=leftIdx) {

            //基准值
            int temp = a[leftIdx];

            int tempLeft = leftIdx;
            int tempRight = rightIdx;

            while (tempLeft < tempRight) {

                while (tempLeft < tempRight && a[tempRight] >= temp) {
                    //找到一个小于基准值的，退出，否则继续循环
                    tempRight--;
                }
                a[tempLeft] = a[tempRight];


                while (tempLeft < tempRight && a[tempLeft] <= temp) {
                    //找到一个大于基准值的，退出，否则继续循环
                    tempLeft++;
                }
                a[tempRight] = a[tempLeft];

                printArrays(a);

            }

            a[tempLeft] = temp;
            //对基准值左边的元素进行递归排序
            quickSort(a, leftIdx, tempLeft - 1);
            //对基准值右边的元素进行递归排序。
            quickSort(a, tempRight + 1, rightIdx);


        }

    }


    private static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "、");
        }
        System.out.println();
    }

}
