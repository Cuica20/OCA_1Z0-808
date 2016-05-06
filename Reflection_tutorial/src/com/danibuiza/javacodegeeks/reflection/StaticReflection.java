package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Reflection related to static elements
 * 
 * @author dgutierrez-diez
 */
public class StaticReflection
{

    static class StaticExample
    {
        int counter;
    }

    public static void main( String[] args ) throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchFieldException
    {

        // 1 access static class
        System.out.println( "directly " + StaticExample.class.getName() );

        // 2 this throws an exception
        try
        {
            Class<?> forname = Class.forName( "com.danibuiza.javacodegeeks.reflection.StaticReflection.StaticExample" );
            System.out.println( "class for name " + forname.getName() );
        }
        catch( ClassNotFoundException ex )
        {
            System.err.println( "class not found " + ex.getMessage() );
        }

        // 3 this would work but is not that nice
        try
        {
            Class<?> forname = Class.forName( "com.danibuiza.javacodegeeks.reflection.StaticReflection$StaticExample" );
            System.out.println( "class for name " + forname.getName() );
        }
        catch( ClassNotFoundException ex )
        {
            System.err.println( "class not found " + ex.getMessage() );
        }

        // 4 another way iterating through all classes declared inside this class
        Class<?>[] classes = StaticReflection.class.getDeclaredClasses();
        for( Class<?> class1 : classes )
        {
            System.out.println( "iterating through declared classes " + class1.getName() );
        }

        // access static methods in the same way as instance ones
        Method mathMethod = Math.class.getDeclaredMethod( "round", double.class );

        // object can be null since method is static
        Object result = mathMethod.invoke( null, new Double( 12.4 ) );
        System.out.println( "result of calling Math.round using reflection for 12.4 " + result );

        // static field access, instance can be null
        Field counterField = Counter.class.getDeclaredField( "counter" );
        System.out.println( counterField.get( null ) );

    }

}
