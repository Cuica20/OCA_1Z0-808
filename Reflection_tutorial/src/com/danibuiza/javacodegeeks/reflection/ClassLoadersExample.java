package com.danibuiza.javacodegeeks.reflection;

/**
 * Examples of class loaders in conjunction with reflection
 * 
 * @author dgutierrez-diez
 */
public class ClassLoadersExample
{

    public static void main( String[] args ) throws ClassNotFoundException
    {
        // using the ClassLoader file it is possible to retrieve the default system class loader
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        System.out.println("system class loader " + systemClassLoader.getClass().getName());
        
        // you can get the used class loader for a given class
        ClassLoader classClassLoader = ReflectableClass.class.getClassLoader();

        // in this case should be the same
        if( systemClassLoader.equals( classClassLoader ) )
        {
            System.out.println( "class loaders are the same" );
        }
        else
        {
            throw new RuntimeException( "class loaders are not the same" );
        }

        // it is possible to load any kind of class using an specific class loader, in this case,
        // the system default one, using the loadClass() method
        Class<?> reflectableClassInstanceLoaded = systemClassLoader
                .loadClass( "com.danibuiza.javacodegeeks.reflection.ReflectableClass" );
        // java.lang.Class
        System.out.println( reflectableClassInstanceLoaded.getClass().getName() );
        // com.danibuiza.javacodegeeks.reflection.ReflectableClass
        System.out.println( reflectableClassInstanceLoaded.getTypeName() );

        // it is possible to do it also using class for name and passing the class loader as
        // parameter
        Class<?> reflectableClassInstanceForName = Class
                .forName( "com.danibuiza.javacodegeeks.reflection.ReflectableClass", true, systemClassLoader );

        // java.lang.Class
        System.out.println( reflectableClassInstanceForName.getClass().getName() );

        System.out.println( reflectableClassInstanceForName.getTypeName() );

    }
}
