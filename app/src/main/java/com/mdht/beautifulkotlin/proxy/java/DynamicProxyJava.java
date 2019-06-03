package com.mdht.beautifulkotlin.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyJava implements InvocationHandler {
    private Object object;

    public DynamicProxyJava(Object object) {
        this.object = object;
    }

    //第一个参数就是代理者，如果你想对代理者做一些操作可以使用这个参数；第二个就是被执行的方法，第三个是执行该方法所需的参数。
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(object, objects);
        return result;
    }
}
