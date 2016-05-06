package com.danibuiza.javacodegeeks.reflection;

import java.util.List;

/**
 * Class to show how to use reflection and generics
 * 
 * @author dgutierrez-diez
 */
public class GenericsClass
{

    List<String> internalList;

    public List<String> getInternalList()
    {
        return internalList;
    }

    public void setInternalList( List<String> internalList )
    {
        this.internalList = internalList;
    }

}
