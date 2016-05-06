package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HandlerImpl implements InvocationHandler
{

    @Override
    public Object invoke( Object obj, Method method, Object[] arguments ) throws Throwable
    {
        System.out.println( "using proxy " + obj.getClass().getName() );
        System.out.println( "method " + method.getName() + " from interface " + method.getDeclaringClass().getName() );

        // we can check dynamically the interface and load the implementation that we want
        if( method.getDeclaringClass().getName().equals( "com.danibuiza.javacodegeeks.reflection.InformationInterface" ) )
        {
            InformationClass informationImpl = InformationClass.class.newInstance();
            return method.invoke( informationImpl, arguments );
        }

        return null;
    }

}
