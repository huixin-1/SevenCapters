package com.mashibing.FourClass.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(1000);
        //获取服务端的套接字对象
        Socket server=serverSocket.accept();

        //-------------------接收客户端的输入--------------------
        //获取输入流对象
        InputStream inputStream=server.getInputStream();
        byte[] buf=new byte[1024];
        int length=inputStream.read(buf);
        System.out.println("客户端传输的数据是："+new String(buf,0,length));
        //----------------------返回客户端输入---------------------
        OutputStream outputStream=server.getOutputStream();
        outputStream.write("你好，收到".getBytes());
        //关闭流对象
        outputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();


    }
}
