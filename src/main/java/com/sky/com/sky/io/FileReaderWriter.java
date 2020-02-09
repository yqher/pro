package com.sky.com.sky.io;

import org.junit.Test;

import java.io.*;

public class FileReaderWriter {
    @Test
    public void fileReaderTest()  {
        FileReader fileReader = null;
        try {
            //实例化File类对象，指明要操作的文件
            File file = new File("hello.txt");
            //创建FileReader，提供具体的流
            fileReader = new FileReader(file);
            //调用read方法，读取数据
            //方式一：
       /* int read = fileReader.read();
        while(read!=-1){
            System.out.print((char) read);
            read = fileReader.read();
        }*/
            //方式二：
            int read;
            while((read = fileReader.read())!=-1){
                System.out.print((char) read);
            }
            //方式三：read升级
            char[] cbuf = new char[5];
            int len ;
            //read(char[] cbuf)返回每次返回实际读取的字符个数。如果到达文件末尾，返回-1
            while ((len=fileReader.read(cbuf))!=-1){
               /* for(int i =0;i<len;i++){
                    System.out.print(cbuf[i]);
                }*/

               //方式四：
                String s = new String(cbuf, 0, len);
                System.out.print(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if(fileReader != null)
                     fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void fileWriterTest(){
        FileWriter fileWriter = null;
        try {
            // 实例化File类，指明要操作的文件
            File file = new File("hello.txt");
            //指定具体的输出流
             fileWriter = new FileWriter(file, true);
            //写数据
            fileWriter.write("\n你好");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null) {
                try {
                    //关闭流
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void fileReaderWriterTest(){
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            //实例化File类，指明读入和写出的文件
        /*    File srcFile = new File("hello.txt");
            File destFile = new File("helloCopy.txt");*/
            File srcFile = new File("1.jpg");
            File destFile = new File("2.jpg");

            //创建输入输出流
         /*   fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);*/
            fileInputStream = new FileInputStream(srcFile);
             fileOutputStream = new FileOutputStream(destFile);

            //执行读写操作
           /* char[] cbuf = new char[5];
            int len;
            while((len = fileReader.read(cbuf))!=-1){
                fileWriter.write(cbuf,0,len);
            }*/
            byte[] cbuf = new byte[1024];
            int len;
            while((len = fileInputStream.read(cbuf))!=-1){
                fileOutputStream.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (fileOutputStream!=null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileInputStream!=null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    @Test
    public void testFileReaderFileWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //不能使用字符流来处理图片等字节数据
//            File srcFile = new File("爱情与友情.jpg");
//            File destFile = new File("爱情与友情1.jpg");


            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);


            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while((len = fr.read(cbuf)) != -1){
                //每次写出len个字符
                fw.write(cbuf,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            //方式一：
//            try {
//                if(fw != null)
//                    fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally{
//                try {
//                    if(fr != null)
//                        fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            //方式二：
            try {
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
