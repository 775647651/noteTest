package com.succ.Design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentInvocation<T> implements InvocationHandler {
    T target;

    //proxy 被代理对象
    //method 执行的方法
    //objects 参数
    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
        MonitorUtil.start();
        Object result = method.invoke(target,objects);
        MonitorUtil.finish(method.getName());
        return result;
    }

    public StudentInvocation(T target){
        this.target = target;
    }
}
