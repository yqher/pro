package com.sky.com.sky.io;

import org.junit.Test;

import java.io.*;

public class ConvertIOTest {
    @Test
    public void inputStreamReaderTest(){
        InputStreamReader inputStreamReader = null;
        try {
            FileInputStream fis= new FileInputStream(new File("hello.txt"));
            inputStreamReader = new InputStreamReader(fis,"UTF-8");

            char[] chars= new char[1024];
            int len;
            while((len = inputStreamReader.read(chars))!= -1){
                String s = new String(chars, 0, len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStreamReader!= null)
                      inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
    @Test
    public void inputStreamReaderAndOutPutStreamWriterTest(){
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            //创建文件
            //创建流，字节流，转换流
            inputStreamReader = new InputStreamReader(new FileInputStream(new File("hello.txt")),"UTF-8");
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("hello5.txt")),"GBK");

            //读写
            char[] cbuf = new char[1024];
            int len;
            while((len = inputStreamReader.read(cbuf))!=-1){
                outputStreamWriter.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if(outputStreamWriter!=null)
                    outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(inputStreamReader!=null)
                    inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
