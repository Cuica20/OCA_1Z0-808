package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Reflection and methods
 * 
 * @author dgutierrez-diez
 */
public class ReflectionMethods
{

    public static void main( String[] args ) throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException
    {
        String stringer = "this is a String called stringer";

        Class<String> stringclass = String.class;

        stringclass.getMethods();

        Method[] methods = stringclass.getMethods();

        // All methods for the String class
        for( Method method : methods )
        {
            System.out.println( "****************************************************" );
            System.out.println( "name: " + method.getName() );
            System.out.println( "defaultValue: " + method.getDefaultValue() );

            System.out.println( "generic return type: " + method.getGenericReturnType() );
            System.out.println( "return type: " + method.getReturnType() );

            System.out.println( "modifiers: " + method.getModifiers() );

            // Parameters
            Parameter[] parameters = method.getParameters();
            System.out.println( parameters.length + " parameters:" );
            // also method.getParameterCount() is possible
            for( Parameter parameter : parameters )
            {
                System.out.println( "parameter name: " + parameter.getName() );
                System.out.println( "parameter type: " + parameter.getType() );
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.println( parameterTypes.length + " parameters:" );
            for( Class<?> parameterType : parameterTypes )
            {
                System.out.println( "parameter type name: " + parameterType.getName() );
            }

            // Exceptions
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            System.out.println( exceptionTypes.length + " exception types: " );
            for( Class<?> exceptionType : exceptionTypes )
            {
                System.out.println( "exception name " + exceptionType.getName() );
            }

            System.out.println( "is accesible: " + method.isAccessible() );
            System.out.println( "is varArgs: " + method.isVarArgs() );

        }

        // you can retrieve methods directly as well using name and parameters
        Method methodIndexOf = stringclass.getMethod( "indexOf", String.class );
        // also primitive types can be used as parameters
        Method methodCharAt = stringclass.getMethod( "charAt", int.class );

        // it is possible to invoke methods on an object as well
        Object indexOf = methodIndexOf.invoke( stringer, "called" );
        @SuppressWarnings( "unused" )
        Object chartAt = methodCharAt.invoke( stringer, 10 );

        // using the return type we can cast the results of the desired methods
        Class<?> indexOfReturnType = methodIndexOf.getReturnType();
        if( Integer.class.equals( indexOfReturnType ) )
        {
            int indexOfAsInt = (Integer)indexOf;
            System.out.println( "indexOfAsInt = " + indexOfAsInt );
        }

        // or using instanceof as well
        if( indexOf instanceof Integer )
        {
            int indexOfAsInt = (Integer)indexOf;
            System.out.println( "indexOfAsInt = " + indexOfAsInt );
        }

        EmptyClass instanceEmptyClass = new EmptyClass();
        // setAccesible we can change the visibility of the methods, this is not possible in safe
        // environments like applets and others
        try
        {
            // if we use getMethod we would get a NoSuchMethodException
            Method methodIsEmpty = EmptyClass.class.getDeclaredMethod( "isEmpty" );
            // we can call public methods
            System.out.println( methodIsEmpty.invoke( instanceEmptyClass ) );
        }
        catch( IllegalAccessException ex )
        {
            System.err.println( "we get this exception " + ex.getMessage() );
        }
        // we change the visibility
        Method methodIsEmpty = EmptyClass.class.getDeclaredMethod( "isEmpty" );
        methodIsEmpty.setAccessible( true );

        System.out.println( methodIsEmpty.invoke( instanceEmptyClass ) );

    }
}
