package com.danibuiza.javacodegeeks.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Annotations and reflection
 * 
 * @author dgutierrez-diez
 */
public class ReflectionAnnotations
{

    public static void main( String[] args ) throws Exception
    {

        Class<ReflectableClass> object = ReflectableClass.class;
        // Retrieve all annotations from the class
        Annotation[] annotations = object.getAnnotations();
        for( Annotation annotation : annotations )
        {
            System.out.println( annotation );
        }

        // Checks if an annotation is present
        if( object.isAnnotationPresent( Reflectable.class ) )
        {
            // Gets the desired annotation
            Annotation annotation = object.getAnnotation( Reflectable.class );

            System.out.println( annotation + " present in class " + object.getClass() );// java.lang.class
            System.out.println( annotation + " present in class " + object.getTypeName() );// com.danibuiza.javacodegeeks.reflection.ReflectableClass

        }
        // the same for all methods of the class
        for( Method method : object.getDeclaredMethods() )
        {
            //amount of annotaitons
            System.out.println(method.getAnnotations().length);
            
            if( method.isAnnotationPresent( Reflectable.class ) )
            {
                Annotation annotation = method.getAnnotation( Reflectable.class );
                System.out.println( annotation + " present in method " + method.getName() );
            }
            else
            {
                System.out.println( "annotation not present in method " + method.getName() );
            }

        }
    }

}
