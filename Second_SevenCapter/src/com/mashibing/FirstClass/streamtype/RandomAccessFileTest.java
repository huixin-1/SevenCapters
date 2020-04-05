package com.mashibing.FirstClass.streamtype;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        File file = new File("dox.txt");

        //整个文件的大小
        long length =file.length();

        //规定块的大小
        int blockSize=100;

        //文件可以被切分成多少个块
        //ceil向上取整
        int size=(int)Math.ceil(length*1.0/blockSize);
        System.out.printf("要被切成《%d》个块",size);
        System.out.println();

//定义偏移量
        int beginPos=0;
        int actualSize=(int)(blockSize>length?length:blockSize);

        for (int i = 0;i<size;i++){
            //每次读取块的时候的起始偏量
            beginPos=i*blockSize;
            if (i==size-1){
                actualSize=(int)length;
            }else {
                actualSize=blockSize;
                length-=actualSize;

            }
            System.out.println(i+"---》起始位置是："+beginPos+"--->读取的大小是："+actualSize);


        }

    }

    public static void readSpilt(int i,int beginPos,int actualSize){
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile=new RandomAccessFile(new File("dox.txt"),"r");
            //表示从哪个偏移量开始读取数据
            randomAccessFile.seek(beginPos);
            byte[] bytes=new byte[1024];
            int length=0;
            while((length = randomAccessFile.read(bytes))!=-1){
                if(actualSize>length){
                    System.out.println(new String(bytes,0,length));
                    actualSize-=length;
                }else {
                    System.out.println(new String(bytes,0,actualSize));
                    break;
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/*

要被切成《4》个块
0---》起始位置是：0--->读取的大小是：100
1---》起始位置是：100--->读取的大小是：100
2---》起始位置是：200--->读取的大小是：100
3---》起始位置是：300--->读取的大小是：35

Process finished with exit code 0

 */