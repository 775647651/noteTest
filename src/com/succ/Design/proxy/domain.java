package com.succ.Design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class domain {

    public static void main(String[] args) {
        Person stu = new Student("zhangsan");
        InvocationHandler inv = new StudentInvocation<Person>(stu);
        Person proxy = (Person)Proxy.newProxyInstance(Student.class.getClassLoader(),inv.getClass().getInterfaces(),inv);
        proxy.giveMoney();
    }
}
