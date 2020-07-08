package demo6;

/**
 * User: van
 * Date: 2020-06-28
 * Time: 10:34
 */
public class HeapSort {

    public static void main(String[] args) {

        int[] a = new int[20];
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 10);
            a[i] = random;
        }

        printArrays(a);
        heapSort(a, a.length - 1);
        printArrays(a);

    }

    private static void heapSort(int[] a, int len) {
        if (len < 0) {
            return;
        }

        for (int i = len; i >= 0; i--) {
            //比较当前节点和父节点大小
            int parent = (i - 1) / 2;
            int p = a[parent];
            if (a[i] > p) {
                a[parent] = a[i];
                a[i] = p;
            }
        }

        //将跟节点和末尾节点交换
        int temp = a[len];
        a[len] = a[0];
        a[0] = temp;

        //将末尾节点踢出树结构，下次不在比较
        len--;
        heapSort(a, len);

    }

    private static void printArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "、");
        }
        System.out.println();
    }


}
