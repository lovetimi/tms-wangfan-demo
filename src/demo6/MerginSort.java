package demo6;

/**
 * User: van
 * Date: 2020-06-28
 * Time: 16:35
 */
public class MerginSort {

    public static void main(String[] args) {

        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            int random = (int) (Math.random() * 10);
            a[i] = random;
        }

        printArrays(a);

        int[] b = new int[20];
        merginSort(a, b, 0, a.length - 1);

        printArrays(a);

    }

    private static void merginSort(int[] arr, int[] result, int start, int end) {

        if (start >= end)
            return;
        int len = end - start;
        int mid = (len / 2) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merginSort(arr, result, start1, end1);
        merginSort(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];

    }


    private static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "、");
        }
        System.out.println();
    }


}
