package com.danibuiza.javacodegeeks.reflection;

public class ReflectionPrimitives
{

    public static void main( String[] args ) throws InstantiationException, IllegalAccessException
    {
        Class<Integer> intClass = int.class;

        System.out.println( "is primitive: " + intClass.isPrimitive() );

        Integer intInstance = intClass.newInstance();

        intInstance += 10;

        System.out.println( intInstance );

    }
}
