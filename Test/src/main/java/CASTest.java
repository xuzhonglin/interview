import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author colinxu
 * @date 2021/8/2 17:00
 * @description 验证cas
 */
public class CASTest {

    public static int cnt = 0;
    public static AtomicInteger cnt2 = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized ("CAS") {
                        for (int j = 0; j < 100; j++) {
                            System.out.println(Thread.currentThread().getName() + " : " + cnt);
                            cnt++;
                        }
                    }

                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println(cnt);
    }


}
