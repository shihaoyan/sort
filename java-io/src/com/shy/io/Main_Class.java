package com.shy.io;

import java.io.*;

/**
 * @author 石皓岩
 * @create 2020-04-24 16:05
 * 描述：io流主类
 */
public class Main_Class {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\92346\\Desktop\\test.txt");
        InputStream is = null;
        is = new FileInputStream(file);
        Reader reader = new InputStreamReader(is);

        BufferedReader br = new BufferedReader(reader);
        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }



    }
}
