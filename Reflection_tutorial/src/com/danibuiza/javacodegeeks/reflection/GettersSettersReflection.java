package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GettersSettersReflection
{

    public static void main( String[] args ) throws IllegalAccessException, IllegalArgumentException,
            InvocationTargetException
    {
        Car car = new Car( "vw touran", "2010", "12000" );

        Method[] methods = car.getClass().getDeclaredMethods();

        // all getters, original values
        for( Method method : methods )
        {
            if( method.getName().startsWith( "get" ) )
            {
                System.out.println( method.invoke( car ) );
            }
        }

        // setting values
        for( Method method : methods )
        {

            if( method.getName().startsWith( "set" ) )
            {
                method.invoke( car, "destroyed" );
            }
        }

        // get new values
        for( Method method : methods )
        {
            if( method.getName().startsWith( "get" ) )
            {
                System.out.println( method.invoke( car ) );
            }
        }

    }
}
