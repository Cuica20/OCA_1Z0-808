package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * New features related to reflection in Java 8: getParameters and lambdas very good article about
 * lambdas and reflection from brian goetz:
 * http://cr.openjdk.java.net/~briangoetz/lambda/lambda-translation.html
 * 
 * @author dgutierrez-diez
 */
public class Java8Reflection
{

    public static void main( String[] args )
    {
        getParameters();

    }

    private static void getParameters()
    {
        /*
         * Method Parameter Reflection (RFE: JDK-8004841): You can obtain the names of the formal
         * parameters of any method or constructor with the method
         * java.lang.reflect.Executable.getParameters. However, .class files do not store formal
         * parameter names by default. To store formal parameter names in a particular .class file,
         * and thus enable the Reflection API to retrieve formal parameter names, compile the source
         * file with the -parameters option of the javac compiler.
         */

        Class<String> stringClass = String.class;
        for( Method methodStringClass : stringClass.getDeclaredMethods() )
        {
            System.out.println( "method " + methodStringClass.getName() );
            for( Parameter paramMethodStringClass : methodStringClass.getParameters() )
            {
                // arg0, arg1, etc because the eclipse compiling tool (different than javac) does
                // not support -parameters option yet
                System.out.println( " parameter name " + paramMethodStringClass.getName() );
                System.out.println( " parameter type " + paramMethodStringClass.getType() );
            }
        }

        /*
         * What is new with JDK 8 is that there is an extended API and the possibility for JVMs to
         * provide the real parameter names instead of arg0, arg1, ...
         */

        /* This is the output with -parameters option: src/outputJava8Reflection.txt */
        /* This is the output without -parameters option: src/outputWithoutJava8Reflection.txt */

    }

}
