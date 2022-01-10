package com.ebig;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class Stringtest {
    public static void main(String[] args) {

        System.out.println(new Stringtest().reverse("qwer"));
    }

    public String reverse(String abc){
        if (abc.length()==1){
            return (abc);
        }
        return (reverse(abc.substring(1,abc.length()))+abc.charAt(0));
    }

    @Test
    public void testEquals(){
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Programming";
        String s4 = new String("Programming");
        String s5 = "Programming";
        System.out.println(s1 == s2);//false
        System.out.println(s4 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s1 == s1.intern());//true
    }

    @Test
    public void testByte() throws UnsupportedEncodingException{//怎样将GB2312编码的字符串转换为ISO-8859-1编码的字符串？
        String abc = "123";
        String rs = new String(abc.getBytes("GB2312"),"ISO-8859-1");
    }
}
