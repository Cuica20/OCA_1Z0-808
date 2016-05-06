package com.danibuiza.javacodegeeks.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * Classes and reflection: private methods, static methods and elements, getters, setters,
 * constructors http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html
 * 
 * @author dgutierrez-diez
 */
public class ReflectionClasses
{
    public static void main( String[] args ) throws NoSuchFieldException, SecurityException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            ClassNotFoundException
    {
        String stringer = "this is a String called stringer";

        // get class from an object
        Class<? extends String> stringGetClass = stringer.getClass();

        // get class from a class name
        Class<String> stringclass = String.class;

        // get all accesible methods
        @SuppressWarnings( "unused" )
        Method[] methods = stringclass.getMethods();

        // get all declared methods, also non public
        @SuppressWarnings( "unused" )
        Method[] declaredMethods = stringGetClass.getDeclaredMethods();

        // gets a specific method
        @SuppressWarnings( "unused" )
        Method equalsMethod = stringGetClass.getMethod( "equalsIgnoreCase", String.class );

        // for more info http://docs.oracle.com/javase/7/docs/api/java/lang/reflect/Modifier.html
        int modifiers = stringGetClass.getModifiers();

        // the same for abstract, volatile, etc
        System.out.println( "is public " + Modifier.isPublic( modifiers ) );

        // get all fields
        stringGetClass.getFields();

        // get a declared field, the class String has no public fields
        stringGetClass.getDeclaredField( "hash" );

        // get all visible constructors
        Constructor<?>[] constructors = stringGetClass.getConstructors();

        // all constructors
        Constructor<?>[] declaredConstructors = stringclass.getDeclaredConstructors();

        System.out.println( "number of visible constructors " + constructors.length );

        System.out.println( "number of total constructors " + declaredConstructors.length );

        for( Constructor<?> constructor : constructors )
        {
            int numberParams = constructor.getParameterCount();
            System.out.println( "constructor " + constructor.getName() );
            System.out.println( "number of arguments " + numberParams );
            // public, private, etc.
            int modifiersConstructor = constructor.getModifiers();
            System.out.println( "modifiers " + modifiersConstructor );
            // array of parameters, more info in the methods section
            @SuppressWarnings( "unused" )
            Parameter[] parameters = constructor.getParameters();
            // annotations array, more info in the annotations section
            @SuppressWarnings( "unused" )
            Annotation[] annotations = constructor.getAnnotations();

            if( numberParams == 0 )
            {
                // can be used to create new instances
                @SuppressWarnings( "unused" )
                String danibuizaString = (String)constructor.newInstance();
            }
        }
        // gets the canonical name
        System.out.println( "canonical name " + stringGetClass.getCanonicalName() );

        // get the component type
        @SuppressWarnings( "unused" )
        Class<?> componentType = stringGetClass.getComponentType();

        // get the type name
        String typename = stringGetClass.getTypeName();
        System.out.println( "type name " + typename );

        // returns true if the object is instance of the class, false otherwise
        stringGetClass.isInstance( "dani" );

        // checks if the object is of a primitive type, in this case, not
        stringGetClass.isPrimitive();

        Class<?> enclosingClass = stringGetClass.getEnclosingClass();
        System.out.println( "enclosing class " + enclosingClass );

        // it is possible to create instance at runtime
        @SuppressWarnings( "unused" )
        String newInstanceStringClass = stringclass.newInstance();

        @SuppressWarnings( "unused" )
        String otherInstance = (String)Class.forName( "java.lang.String" ).newInstance();
    }
}
