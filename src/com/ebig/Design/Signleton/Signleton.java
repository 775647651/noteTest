package com.ebig.Design.Signleton;


//饿汉 浪费内存资源  线程安全
public class Signleton {
    private static Signleton signleton= new Signleton();
    private Signleton(){
    }

    public static Signleton getInstance(){
        return signleton;
    }
}
