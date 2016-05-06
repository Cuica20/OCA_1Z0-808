package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Generics and reflection
 * 
 * @author dgutierrez-diez
 */
public class ReflectionGenerics
{
    public static void main( String[] args ) throws NoSuchMethodException
    {
        extractGenericsArguments();

    }

    private static void extractGenericsArguments() throws NoSuchMethodException
    {
        // we retrieve a method
        Method getInternalListMethod = GenericsClass.class.getMethod( "getInternalList" );

        // we get the return type
        Type getInternalListMethodGenericReturnType = getInternalListMethod.getGenericReturnType();

        // we can check if the return type is parameterized (using ParameterizedType)
        if( getInternalListMethodGenericReturnType instanceof ParameterizedType )
        {
            ParameterizedType parameterizedType = (ParameterizedType)getInternalListMethodGenericReturnType;
            // we get the type of the arguments for the parameterized type
            Type[] typeArguments = parameterizedType.getActualTypeArguments();
            for( Type typeArgument : typeArguments )
            {
                // we can work with that now
                Class<?> typeClass = (Class<?>)typeArgument;
                System.out.println( "typeArgument = " + typeArgument );
                System.out.println( "typeClass = " + typeClass );
            }
        }
    }

    // similar stuff can be done for the arguments of the methods and for fields

}
