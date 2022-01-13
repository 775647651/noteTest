package com.ebig.Design.Signleton;

public class Signleton2 {
    private static volatile Signleton2 signleton2 = null;
    private Signleton2(){

    }

    public static Signleton2 getInstance(){
        if (signleton2 == null){
            synchronized (Signleton2.class) {
                if(signleton2 == null) {
                    signleton2 = new Signleton2();
                }
            }
        }
        return signleton2;
    }
}
