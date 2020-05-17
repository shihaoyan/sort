package com.shy.thread;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author 石皓岩
 * @create 2020-05-17 12:49
 * 描述：
 */
public class TestClass {
    @Test
    public void test1() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "走了");
                countDownLatch.countDown();
            }, String.valueOf(i + 1)).start();
        }
        countDownLatch.await();
        System.out.println("关门");
    }

    @Test
    public void test2() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("凑齐了7颗龙珠");
        });
        for (int i = 0; i < 7; i++) {
            new Thread(() -> {

                try {
                    System.out.println("凑齐了 " + Thread.currentThread().getName() + "个");
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i + 1)).start();
        }
    }

    @Test
    public void test3() {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("第" + Thread.currentThread().getName() + "号车抢到车位");
                    TimeUnit.SECONDS.sleep(new Random().nextInt(3));
                    System.out.println("第" + Thread.currentThread().getName() + "号车走了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }, String.valueOf(i + 1)).start();
        }


    }

}
