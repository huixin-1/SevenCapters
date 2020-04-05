package com.mashibing.ThirdClass.pc4;

import java.util.concurrent.BlockingQueue;

public class ComsumerQueue implements Runnable {
    private BlockingQueue<Goods> blockingQueue;

    public ComsumerQueue(BlockingQueue blockingQueue){
        this.blockingQueue=blockingQueue;
    }

    @Override
    public void run(){
        for (int i=0;i<10;i++){
            try {
                Goods goods=blockingQueue.take();
                System.out.println("消费者消费的商品是:"+goods.getBrand()+"--"+goods.getName());
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
