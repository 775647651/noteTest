package com.ebig;

public class AllTest {
    public static void main(String[] args) {
        int a = 0;
        try {
            assert (a>=1);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }


}
