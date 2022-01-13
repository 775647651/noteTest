package com.ebig.Design.Factory;

import java.io.Serializable;

public class DesignTest implements Serializable {
    public static final long SerializableId = 1653463614125416465L;

    /**工厂模式:
     1:简单工厂;
     2:工厂方法模式;
     3.抽象工厂
    **/

    public static void main(String[] args) {
        Factory a = new NY();
        a.createPizza("ppp");
    }

}

class NY implements Factory{
    public void createPizza(String orderType){
        switch (orderType){
            case "pppp":
            //return ppppiza;
                break;
            case "zzzz":
                //return zzzzpiza;
                break;
        }
    }
}

class LD implements Factory{
    public void createPizza(String orderType){
        switch (orderType){
            case "pppp":
                //return ppppiza;
                break;
            case "zzzz":
                //return zzzzpiza;
                break;
        }
    }
}

