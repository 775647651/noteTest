package com.succ.CollectionTest;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(90);
        list.add(70);
        Collection a = new LinkedHashSet<>();
        a.add(213);
        a.add(213);
        //sort排序
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
        System.out.println("---------");

        //binarySearch二分查找
        int i=Collections.binarySearch(list, 10);
        System.out.println(i);

        //copy复制
        List<Integer> list2=new ArrayList<Integer>();
        for(int i1=0;i1<5;++i1) {
            list2.add(0);
        }
        //该方法要求目标元素容量大于等于源目标
        Collections.copy(list2, list);
        System.out.println(list2.toString());

        //reserve反转
        Collections.reverse(list2);
        System.out.println(list2.toString());

        //shuffle 打乱
        Collections.shuffle(list2);
        System.out.println(list2.toString());

        //补充：list转成数组
        Integer[] arr=list.toArray(new Integer[0]);
        System.out.println(arr.length);
        //补充：数组转成集合
        String[] nameStrings= {"tang","he","yu"};
        //受限集合，不能添加和删除
        List<String> list3= Arrays.asList(nameStrings);
        System.out.println(list3);

        //注：基本类型转成集合时需要修改为包装类
    }

    @Test
    public void maptest(){
        Map map = new ConcurrentHashMap<String,Object>();
        map.put(123,"123");
        int i = 0;
        while(i <=12){
            map.put(i,"123");
            i++;
        }
    }

    @Test
    public void Treetest(){
        TreeMap map = new TreeMap();
        String a = "213";
        map.size();
        StringBuffer w = new StringBuffer("123");
//        int i = 0;
//        while(i <=12){
//            map.put(i,"123");
//            i++;
//        }
    }

    @Test
    public void ConcurrentHashMap(){
        ConcurrentHashMap map = new ConcurrentHashMap();
        String a = "213";
        map.put("123","12412");
        map.size();
        StringBuffer w = new StringBuffer("123");
    }
}