package com.sky.ip;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    @Test
    public void inetAddressTest(){
        InetAddress byName = null;
        InetAddress localHost = null;
        try {
            byName = InetAddress.getByName("www.atguigu.com");
             localHost = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(byName+"----"+localHost);
        System.out.println(byName.getHostAddress()+"-------->"+byName.getHostName());
    }
}
