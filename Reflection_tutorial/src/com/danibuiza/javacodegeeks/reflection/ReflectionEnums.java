package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.Field;

enum ExampleEnum
{
    ONE, TWO, THREE, FOUR
};

/**
 * Enums and reflection
 * 
 * @author dgutierrez-diez
 */
public class ReflectionEnums
{

    public static void main( String[] args ) throws ClassNotFoundException
    {
        //we create an instance of the enum
        ExampleEnum value = ExampleEnum.FOUR;

        // checks if the class is an enum
        System.out.println( "isEnum " + value.getClass().isEnum() );

        // retrieves from the class all enum constants
        ExampleEnum[] enumConstants = value.getClass().getEnumConstants();
        for( ExampleEnum exampleEnum : enumConstants )
        {
            System.out.println( "enum constant " + exampleEnum );
        }

        //Class<?> c = Class.forName( "com.danibuiza.javacodegeeks.reflection.ExampleEnum" );
        Field[] flds = value.getClass().getDeclaredFields();
        for( Field f : flds )
        {
            // check for each field if it is an enum constant or not
            System.out.println( f.getName() + " " + f.isEnumConstant() );
            // more info about enum values here
            // http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

        }

    }
}
