package com.mashibing.SecondClass.ticket;

public class TicketRunnable3 implements Runnable {
    private  int ticket = 5;

    @Override
    public void run(){
        for (int i=0;i<100;i++){
            sale();
        }

    }
    /*
    使用同步方法解决多线程，线程安全问题
     */

    public synchronized void sale(){
        try {
            //让他睡两秒
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//加锁
        synchronized (this) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
            }

        }

    }



    public static void main(String[] args) {
        TicketRunnable3 ticket= new TicketRunnable3();

        Thread t1 = new Thread(ticket,"A");
        Thread t2 = new Thread(ticket,"B");
        Thread t3 = new Thread(ticket,"C");
        Thread t4 = new Thread(ticket,"D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
