package com.succ.CollectionTest;

import com.succ.entity.Car;
import org.junit.Test;

import java.util.*;

public class ItertorTest {
    public static void main(String[] args) {

    }

    //第三组: 通过EntrySet 来获取 k-v
    @Test
    public void ItertorT() {
        Map map = new HashMap();
        //第三组: 通过EntrySet 来获取 k-v
        Set entrySet = map.entrySet();// EntrySet<Map.Entry<K,V>>
        //(1) 增强for
        System.out.println("----使用EntrySet 的 for增强(第3种)----");
        for (Object entry : entrySet) {
            //将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //(2) 迭代器
        System.out.println("----使用EntrySet 的 迭代器(第4种)----");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry =  iterator3.next();
            //System.out.println(next.getClass());//HashMap$Node -实现-> Map.Entry (getKey,getValue)
            //向下转型 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }

    @Test
    public void ArrayListTest(){
        Collection col = new ArrayList();
        Map<String, Object> map = new HashMap<>();
        Vector v = new Vector();
        List li = new LinkedList();
        li.add(112);
        li.add(42);
        HashSet s = new HashSet();
        s.add("12");
        s.add("421");
        map.put("1", "213");
        col.add("213");
        col.add(1);
        col.add(null);
        col.add("213");
        col.add("213");
        col.remove(1);
        col.add(new Car("宝马", 12));
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

