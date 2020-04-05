package com.mashibing.FirstClass.exercise;

import java.io.*;

public class ExitTest2 {
    public static void main(String[] args) {

        try (InputStreamReader inputStreamReader=new InputStreamReader(System.in);
             OutputStreamWriter outputStreamWriter =new OutputStreamWriter(System.out);
             BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);){
            String str="";
            while (!str.equals("exit")){
                str=bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.flush();

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
/*
abc
abc
马士兵教育
马士兵教育
exit
exit  Process finished with exit code 0
 */