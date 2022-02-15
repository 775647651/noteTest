package com.succ;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest {

    @Test
    public void testfile() throws IOException {
        File file = new File("E://test.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            throw e;
        }
    }

    @Test
    public void testfile2() throws IOException {
        String pname = "E:\\";
        String name = "2133.txt";
        try {
            File file = new File(pname,name);
            file.createNewFile();
        }catch (IOException e){
            throw e;
        }
    }

    @Test
    public void testfile3() throws IOException {
        File parentfile = new File("E:\\");
        String name = "213.txt";
        try {
            File file = new File(parentfile,name);
            file.createNewFile();
        }catch (IOException e){
            throw e;
        }
    }
}
