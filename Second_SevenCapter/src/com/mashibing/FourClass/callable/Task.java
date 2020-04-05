package com.mashibing.FourClass.callable;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    private int i;

    public Task(int i){
        this.i=i;

    }




    @Override
    public String call() throws Exception{
        Thread.sleep(1000);
        return Thread.currentThread().getName()+"is running "+i;

    }
}
