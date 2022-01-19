package com.ebig.CollectionTest;

import com.ebig.entity.Car;
import org.junit.Test;

import java.util.*;

public class ItertorTest {
    public static void main(String[] args) {

    }

    @Test
    public void ItertorT() {
        Collection coll = new ArrayList();
        Iterator iter = coll.iterator();
        while(iter.hasNext()){
            List a = (List) iter.next();
            System.out.println(a.toString());
        }
    }

    @Test
    public void ArrayListTest(){
        Collection col = new ArrayList();
        Map<String,Object> map = new HashMap<>();
        map.put("1","213");
        col.add("213");
        col.add(1);
        col.add(null);
        col.add(new Car("宝马",12));
        col.add(null);
        System.out.println(col.size());
        System.out.println(col);
    }

    @Test
    public void tt() {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(4,a);
        ListNode c = new ListNode(2,b);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(6,d);
        ListNode f = new ListNode(5,e);
        ttt(c,f);
    }


    public ListNode ttt(ListNode l1,ListNode l2) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        while(l1 != null){
            s1.append(l1.val);
            l1 = l1.next;
        }
        while(l2 !=null){
            s2.append(l2.val);
            l2 = l2.next;
        }
        s1.reverse();
        s2.reverse();
        System.out.println(s1.toString());
        int i = Integer.valueOf(s1.toString()) + Integer.valueOf(s2.toString());
        return new ListNode(i);
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
