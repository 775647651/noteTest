package com.succ;


import org.junit.Test;

import java.time.LocalDateTime;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;

public class LockTest {
    ReadWriteLock lock = new ReentrantReadWriteLock();
    LocalDateTime time = LocalDateTime.now();

    @Test
    public void lock1() throws Exception{
        LockTest test = new LockTest();
        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    test.readMethod(new Thread("1"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    test.writeMethod(new Thread("2"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    test.readMethod(new Thread("3"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    test.writeMethod(new Thread("4"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void readMethod(Thread thread) throws Exception{
        //获得读锁并加锁
        lock.readLock().lock();
        try {
            System.out.println("这里是读操作。。。。。。。。。");
            for (int i = 0; i <59 ; i++) {
                System.out.println(thread.getName()+ "  "+i+"正在读");
            }
        }finally {
            lock.readLock().unlock();
        }
    }
    private void writeMethod(Thread thread) throws Exception{
        //获得写锁并加锁
        lock.writeLock().lock();
        try {
            System.out.println("这里是写操作。。。。。。。。。");
            for (int i = 0; i <20 ; i++) {
                System.out.println(thread.getName()+"  "+ i+"正在写");
            }
        }finally {
            lock.writeLock().unlock();
        }
    }

}
