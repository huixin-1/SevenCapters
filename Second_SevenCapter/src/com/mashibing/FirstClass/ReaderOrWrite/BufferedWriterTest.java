package com.mashibing.FirstClass.ReaderOrWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter=null;
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(new File("abc.txt"));
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("mashibing");
            //换行
            bufferedWriter.newLine();
            //追加
            bufferedWriter.append("马士兵教育");
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
/**
 * abc.txt文件中会出现：
 *   mashibing
 *   马士兵教育
 *
 */
