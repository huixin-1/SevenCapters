package com.mashibing.FourClass;

import java.net.InetAddress;
import java.net.UnknownHostException;
//对ip地址的访问类    面试中几乎不会问到
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost=InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress inetAddress = InetAddress.getByName("LAPTOP-U1C4SDBM");
        System.out.println(inetAddress);
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());
    }
}
/*
LAPTOP-U1C4SDBM/192.168.188.1
LAPTOP-U1C4SDBM/192.168.188.1
192.168.188.1
LAPTOP-U1C4SDBM
 */