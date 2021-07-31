import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.SynchronousQueue;

/**
 * @author colinxu
 * @date 2021/7/31 17:01
 * @description
 */
class MyThreadTest {


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //继承Thread
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println(System.currentTimeMillis() + "线程1.5");


        //实现Runnable
        Thread thread2 = new Thread(new ThreadRunnable());
        thread2.start();

        //实现Callable
        FutureTask<String> futureTask = new FutureTask<String>(new ThreadCallable());
        Thread thread3 = new Thread(futureTask);
        thread3.start();
//        futureTask.wait();
        System.out.println(futureTask.get());

//        Thread thread3=new Thread(new ThreadCallable().)
    }
}
