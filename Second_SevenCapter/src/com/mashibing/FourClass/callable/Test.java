package com.mashibing.FourClass.callable;
//错了  问一下

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(5);
        for (int i=0;i<20;i++){
            //execute没有返回值，而submit有返回值
           Future<String> submit = executorService.submit(new Task(i));
          try {
              String str=submit.get();
                System.out.println(str);
           } catch (InterruptedException e) {
               e.printStackTrace();
          } catch (ExecutionException e) {
               e.printStackTrace(); }

        }
    }
}
