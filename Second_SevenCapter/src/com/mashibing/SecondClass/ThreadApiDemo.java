package com.mashibing.SecondClass;

public class ThreadApiDemo implements Runnable {
    public static void main(String[] args) {
        //获取当前线程对象
        Thread thread=Thread.currentThread();
        //获取当前线程的名称
        System.out.println(thread.getName());
        //获取线程的id
        System.out.println(thread.getId());
        //获取现成的优先级，在一般系统中范围是0-10的值，如果没有经过设置的话，就是默认的值5，有些系统是0-100
        System.out.println(thread.getPriority());
        //设置线程池的优先级
        /*
           优先级越高一定越优先执行吗？
           不一定，只是执行的概率越大
         */
        thread.setPriority(10);
        System.out.println(thread.getPriority());

        ThreadApiDemo threadApiDemo=new ThreadApiDemo();
        Thread t1=new Thread(threadApiDemo);
        t1.start();
        System.out.println(Thread.currentThread());
        for (int i =0;i<5;i++){

            System.out.println(Thread.currentThread().getName()+"-------"+i);
        }


    }

    @Override
    public void run(){
        for (int i =0;i<5;i++){

            System.out.println(Thread.currentThread().getName()+"-------"+i);
        }
    }
}
