package com.mashibing.FirstClass.ReaderOrWrite;

import java.io.*;

public class BufferedReaderTest {
/*
    public static void main(String[] args) {

        Reader reader=null;

        try {
            reader=new BufferedReader(new FileReader("aaa.txt"));
            int read = reader.read();
            System.out.println((char)read);//d
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

  */


/*

    public static void main(String[] args) {


        BufferedReader reader=null;

        try {

            reader=new BufferedReader(new FileReader("aaa.txt"));
            String read = reader.readLine();
            System.out.println(read);//duhasuifhiufhaifhasuicguihf8qhfklqwnfdoqw


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
*/


    public static void main(String[] args) {


        BufferedReader reader=null;

        try {

            reader=new BufferedReader(new FileReader("aaa.txt"));
            String read = null;
            while ((read=reader.readLine())!=null) {
                System.out.println(read);//dadasddsda
                //bfbsgeahjn
                //iduvhaiufbaifkng
                //asyfyfwIGNE
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
