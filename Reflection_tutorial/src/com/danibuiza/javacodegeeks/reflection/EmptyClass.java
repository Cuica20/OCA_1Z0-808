package com.danibuiza.javacodegeeks.reflection;

public class EmptyClass
{
    // the method visibility should be changed in order to access it at runtime, may be prevented
    // under specific circumstances
    @SuppressWarnings( "unused" )
    private boolean isEmpty()
    {
        return false;
    }

}
