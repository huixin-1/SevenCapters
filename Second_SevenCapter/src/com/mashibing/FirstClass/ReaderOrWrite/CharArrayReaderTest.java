package com.mashibing.FirstClass.ReaderOrWrite;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest {
 /*
    public static void main(String[] args) {


        char[] chars="马士兵教育".toCharArray();

        CharArrayReader charArrayReader=new CharArrayReader(chars);
        try {
            int read = charArrayReader.read();
            System.out.println((char)read);//马

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }
    }
*/

    public static void main(String[] args) {


        char[] chars="马士兵教育".toCharArray();

        CharArrayReader charArrayReader=new CharArrayReader(chars);
        try {
            int read = 0;
            while ((read=charArrayReader.read())!=-1){
                System.out.print((char)read);//马士兵教育
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }
    }


}
