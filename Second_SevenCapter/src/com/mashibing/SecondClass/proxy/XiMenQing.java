package com.mashibing.SecondClass.proxy;

public class XiMenQing {
    public static void main(String[] args) {
//        WangPo wangPo=new WangPo();
//        wangPo.playWithMen();
//        wangPo.makeEyesWithMen();

        //潘金莲。。。。
        //潘金莲正在抛媚眼

        JiaShi jiaShi=new JiaShi();
        WangPo wangPo=new WangPo(jiaShi);
        wangPo.makeEyesWithMen();
        wangPo.playWithMen();

        //代理模式   new的是wangpo  但执行的是贾事
        //贾事抛媚眼
        // 贾氏....

    }
}
