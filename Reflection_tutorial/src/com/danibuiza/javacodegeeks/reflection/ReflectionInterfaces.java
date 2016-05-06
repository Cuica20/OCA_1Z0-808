package com.danibuiza.javacodegeeks.reflection;

/**
 * Interfaces and reflection
 * 
 * @author dgutierrez-diez
 */
public class ReflectionInterfaces
{

    public static void main( String[] args ) throws InstantiationException, IllegalAccessException
    {
        // can be accessed like a class
        System.out.println( "interface name: " + InterfaceExample.class.getName() );

        // cannot be instantiated:  java.lang.InstantiationException
        InterfaceExample.class.newInstance();
    }

}
