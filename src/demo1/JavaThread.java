package demo1;

import java.util.concurrent.*;

/**
 * User: van
 * Date: 2018/8/31
 * Time: 13:46
 */
public class JavaThread {

    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        boolean flag = false;
        Future f = es.submit(() -> {
            System.out.println("execute call");
            Thread.sleep(500);
            return 0;
        });
        try {
            System.out.println(f.isDone()); //检测任务是否完成
            System.out.println(f.get(2000, TimeUnit.MILLISECONDS));
            System.out.println(f.isDone()); //检测任务是否完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }finally {
            es.shutdown();
        }
    }
}
