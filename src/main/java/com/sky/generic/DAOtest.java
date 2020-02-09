package com.sky.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DAOtest {
    public static void main(String[] args) {
        DAO dao = new ConsumerDAO();
        dao.add(new Consumer());
    }
    public void print(List<?> t){

    }
    @Test
    public void tongTest(){
        List<String> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();
        print(list1);
    }
}
