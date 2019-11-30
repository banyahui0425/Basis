package com.test2;

import java.util.concurrent.*;

/**
 * @Creater banyahui
 * @Date 2019/11/24 下午 14:06
 * @Description Call线程
 */
public class demo9 {
    public static void main(String[] args)  {
        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int all = 0;
                int i = 999;
                while (i > 0) {
                    all += i;
                    i--;
                }
                return all;
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> submit = service.submit(call);
        try {
            System.out.println("submit = " + submit.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
