package com.ebig;


public class TreadTest {
    public static void main(String[] args) {
        //子父类重写
//        manyTread mt = new manyTread();
//        mt.start();
//        for (int a = 0 ; a < 100 ; a ++){
//            System.out.println("a="+a);
//        }
        //Runnable重写
        Runnable mt = new implTread();
        Thread tt = new Thread(mt);
        tt.start();
        for (int a = 0 ; a < 100 ; a ++){
            System.out.println("a="+a);
        }
    }
}

//多线程的创建方法 子父类重写run方法
class manyTread extends Thread{
    public void run(){
        for (int i = 0 ; i < 100 ; i++){
            System.out.println("i="+i);
        }
    }
}

//多线程的创建方法 接口类重写run方法
class implTread implements Runnable{
    @Override
    public void run(){
        for (int i = 0 ; i < 100 ; i++){
            System.out.println("i="+i);
        }
    }
}

//匿名内部类
class NOname{
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 100; i++) {
                    System.out.println("run():" + i);
                }
            }
        });
        thread.start();
        for (int a = 0 ; a < 100 ; a ++){
            System.out.println("a="+a);
        }
    }
}

//匿名内部类
class testTr{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 100; i++) {
                    System.out.println("run():" + i);
                }
            }
        });
        thread.start();
        thread.stop();
        thread.sleep(1000);
        thread.wait();
        thread.yield();
        thread.getName();
    }
}

