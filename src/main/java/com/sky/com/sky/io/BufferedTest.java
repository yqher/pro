package com.sky.com.sky.io;

import org.junit.Test;

import java.io.*;

public class BufferedTest {
    @Test
    public void bufferedInputOutputStreamTest(){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //读图片，字节流
            //创建文件File类
            File srcFile = new File("1.jpg");
            File destFile = new File("3.jpg");

            //创建流
            //节点流
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            //处理流，缓存字节流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //读写操作
            byte[] buffer = new byte[1024];
            int len;
            while((len = bufferedInputStream.read(buffer))!=-1){
                bufferedOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if(bufferedOutputStream != null)
                    bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bufferedInputStream!=null)
                    bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    @Test
    public void  test1(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //1.造文件
            File srcFile = new File("1.jpg");
            File destFile = new File("4.jpg");
            //2.造流
            //2.1 造节点流
            FileInputStream fis = new FileInputStream((srcFile));
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取、写入
            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            //要求：先关闭外层的流，再关闭内层的流
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            //说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略.
//        fos.close();
//        fis.close();
        }
    }
    @Test
    public void bufferedReaderWriterTest(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //读文本文件
            //创建文件和流
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("hello3.txt")));
            //读写
            String data;
            while((data=br.readLine())!=null){
                bw.write(data+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        //关闭流
        try {
            if(bw!=null)
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(br!=null)
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
