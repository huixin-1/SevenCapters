package com.mashibing.FirstClass.ReaderOrWrite;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream printStream=null;

        try {
          //  printStream=new PrintStream(new FileOutputStream("123.txt")); 出现了一个123.txt

            printStream=new PrintStream(System.out);
            printStream.write("hello mashibing".getBytes());
            printStream.println(true);
            //hello mashibingtrue

            //格式化输出 %s:字符串    %d:整数    %f:浮点数

            System.out.printf("%s--%d---%.2f","abc",123,111.11111);

            //abc--123---111.11

            System.err.println("mashibing");//错误输出  打印出来的是红色的字体

        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();

    }
}
