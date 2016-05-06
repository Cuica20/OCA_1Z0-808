package com.danibuiza.javacodegeeks.reflection;

/**
 * Class to show usage of getters and setters in reflection
 * 
 * @author Javier Cuica
 */
public class Car
{

    private String name;
    private Object price;
    private Object year;

    public Car( String name, String year, String price )
    {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Object getPrice()
    {
        return price;
    }

    public void setPrice( Object price )
    {
        this.price = price;
    }

    public Object getYear()
    {
        return year;
    }

    public void setYear( Object year )
    {
        this.year = year;
    }

}
