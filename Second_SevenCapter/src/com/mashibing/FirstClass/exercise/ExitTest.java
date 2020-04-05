package com.mashibing.FirstClass.exercise;

import java.io.*;

public class ExitTest {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        try {
            String str="";
            while (!str.equals("exit")) {

                str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
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
/*
输入：abc
输出：abc
输入：dgsgshah
输出：dgsgshah
输入：exit
输出：exit
程序结束
 */