package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Examples of dynamic proxies in conjunction with reflection Info about proxies in Java:
 * https://docs.oracle.com/javase/7/docs/api/java/lang/reflect/Proxy.html
 * 
 * @author dgutierrez-diez
 */
public class DynamicProxies
{

    public static void main( String[] args )
    {

        // an invocation handler for our needs
        InvocationHandler myHandler = new HandlerImpl();

        // we can create dynamic proxy clases using the Proxy class
        InformationInterface proxy = (InformationInterface)Proxy.newProxyInstance( InformationInterface.class
                .getClassLoader(), new Class[] { InformationInterface.class }, myHandler );

        // all calls to the proxy will be passed to the handler -> the handler implementation can be
        // decided on runtime as well
        System.out.println( proxy.getInfo() );

    }

}
