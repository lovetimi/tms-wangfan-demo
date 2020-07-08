package demo6;

/**
 * User: van
 * Date: 2020-06-15
 * Time: 16:12
 */
public class Demo {

    public static void main(String[] args) {
        boolean arr[] = generate(86);
        run(arr, 9);
    }

    /**
     * 初始化灯泡，关闭
     * @param a
     * @return
     */
    private static boolean[] generate(int a) {
        boolean[] arr = new boolean[a];
        for (int i = 0; i < a; i++) {
            arr[i] = false;
        }
        return arr;
    }



    private static void run(boolean arr[], int s) {
        int result = 1;
        for (int t = 1; t <= s - 1; t++) {
            System.out.println("当前开关" + result);
            for (int i = 1; i <= arr.length; i++) {
                if (i % t == 0) {
                    arr[i - 1] = !arr[i - 1];
                }
            }
            System.out.println("第" + t + "次");
            printArrays(arr);
        }
        arr[arr.length - 1] = !arr[arr.length - 1];
        printArrays(arr);
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) size++;
        }
        System.out.println(size);
    }

    /**
     * 输出
     * @param a
     */
    private static void printArrays(boolean[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "、");
        }
        System.out.println();
    }


}
