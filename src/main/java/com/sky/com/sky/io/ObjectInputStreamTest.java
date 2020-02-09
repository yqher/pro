package com.sky.com.sky.io;

import org.junit.Test;

import java.io.*;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        ObjectOutputStream oos =
                null;
        try {
           oos = new ObjectOutputStream(new FileOutputStream(new File("object.dat")));
            oos.writeObject(new String("北极bei"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void ObjectInputStreamTest(){
        ObjectInputStream ois= null;
        try {
            ois = new ObjectInputStream(new FileInputStream(new File("object.dat")));

            Object object = ois.readObject();
            String s = (String)object;
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
