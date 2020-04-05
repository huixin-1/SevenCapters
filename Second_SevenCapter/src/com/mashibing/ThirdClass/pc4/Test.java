package com.mashibing.ThirdClass.pc4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        //<Goods>是个换形
        BlockingQueue<Goods> queue=new ArrayBlockingQueue<Goods>(5);
        ProducerQueue producerQueue=new ProducerQueue(queue);
        ComsumerQueue comsumerQueue=new ComsumerQueue(queue);
        new Thread(producerQueue).start();
        new Thread(comsumerQueue).start();

    }
}
