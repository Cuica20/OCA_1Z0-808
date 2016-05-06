package com.danibuiza.javacodegeeks.reflection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * collections and reflections, arrays are also here as well
 * 
 * @author dgutierrez-diez
 */
public class ReflectionCollections
{

    public static void main( String[] args ) throws InstantiationException, IllegalAccessException,
            ClassNotFoundException
    {
        // handle arrays using reflection
        reflectionArrays();

        // handle collections using reflection
        Map<String, String> map = new HashMap<String, String>();
        map.put( "1", "a" );
        map.put( "2", "b" );
        map.put( "3", "c" );
        map.put( "4", "d" );

        reflectionCollections( map );
        reflectionCollections( map.keySet() );
        reflectionCollections( map.values() );

        List<String> list = new ArrayList<String>();
        list.add( "10" );
        list.add( "20" );
        list.add( "30" );
        list.add( "40" );

        reflectionCollections( list );
        reflectionCollections( "this is an string" );

    }

    /**
     * This methods extracts all elements of a collection if the passed ref is a collection
     * 
     * @param ref
     */
    private static void reflectionCollections( Object ref )
    {

        if( ref instanceof Collection )
        {
            System.out.println( "A collection:  " + ref.getClass().getName() );
            @SuppressWarnings( "rawtypes" )
            // not nice
            Iterator items = ( (Collection)ref ).iterator();
            while( items != null && items.hasNext() )
            {
                Object item = items.next();
                System.out.println( "Element of the collection:  " + item.getClass().getName() );
            }
        }
        else
        {
            System.out.println( "Not a collection:  " + ref.getClass().getName() );
        }
    }

    /**
     * Using the Array class we can handle arrays using reflection
     * 
     * @throws ClassNotFoundException
     */
    private static void reflectionArrays() throws ClassNotFoundException
    {
        // using the Array class it is possible to create new arrays passing the type and the length
        // via reflection
        String[] strArrayOne = (String[])Array.newInstance( String.class, 10 );

        // it contains utility methods for setting values
        Array.set( strArrayOne, 0, "member0" );
        Array.set( strArrayOne, 1, "member1" );
        Array.set( strArrayOne, 9, "member9" );

        // and for getting values as well
        System.out.println( "strArrayOne[0] : " + Array.get( strArrayOne, 0 ) );
        System.out.println( "strArrayOne[1] : " + Array.get( strArrayOne, 1 ) );
        System.out.println( "strArrayOne[3] (not initialized) : " + Array.get( strArrayOne, 3 ) );
        System.out.println( "strArrayOne[9] : " + Array.get( strArrayOne, 9 ) );

        // also methods to get the lenght of the array
        System.out.println( "lenght strArrayOne: " + Array.getLength( strArrayOne ) );

        // primitive types work as well
        int[] intArrayOne = (int[])Array.newInstance( int.class, 10 );

        Array.set( intArrayOne, 0, 1 );
        Array.set( intArrayOne, 1, 2 );
        Array.set( intArrayOne, 9, 10 );

        // and specific getters and setters for primitive types
        for( int i = 0; i < Array.getLength( intArrayOne ); ++i )
        {
            System.out.println( "intArrayOne[" + i + "] : " + Array.getInt( intArrayOne, i ) );
        }

        // there are other ways to load arrays:
        // retrieve the class from an instance
        Class<String[]> stringArrayClassUsingInstance = String[].class;
        System.out.println( "stringArrayClassUsingInstance is array: " + stringArrayClassUsingInstance.isArray() );

        // using class for name and passing [I
        Class<?> intArrayUsingClassForName = Class.forName( "[I" );
        System.out.println( "intArrayUsingClassForName is array: " + intArrayUsingClassForName.isArray() );

        // or [Ljava.lang.String
        Class<?> stringArrayClassUsingClassForName = Class.forName( "[Ljava.lang.String;" );
        System.out.println( "stringArrayClassUsingClassForName is array: "
            + stringArrayClassUsingClassForName.isArray() );

        // this has no much sense in my opinion since we are creating an array at runtime and
        // getting the class to create a new one...
        Class<? extends Object> stringArrayClassUsingDoubleLoop = Array.newInstance( String.class, 0 ).getClass();
        System.out.println( "stringArrayClassUsingClassForName is array: " + stringArrayClassUsingDoubleLoop.isArray() );

    }

}
