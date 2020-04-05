package com.mashibing.ThirdClass.pc;
/*
从共享空间拿走产品
 */
public class Consumer implements Runnable{
    private Goods goods;
    public Consumer(Goods goods){
        this.goods=goods;
    }
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者取走了"+this.goods.getBrand()+"----"+this.goods.getName());
        }
    }


}
