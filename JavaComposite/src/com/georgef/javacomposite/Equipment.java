package com.georgef.javacomposite;

/**
 * Created by georgef on 5/22/16.
 * Equipment class defines an interface for all equipment in the part-whole hierarchy
 */
import java.util.Iterator;

import javax.naming.OperationNotSupportedException;

public abstract class Equipment implements Iterable< Equipment >
{
    private String name;

    protected Equipment( String name )
    {
        this.name = name;
    }

    public abstract int power();
    public abstract float netPrice();
    public abstract float discountPrice();

    public String getName()
    {
        return name;
    }

    public void add( Equipment equipment ) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    // Unused for now...
    public void remove( Equipment equipment ) throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    @Override
    public Iterator< Equipment > iterator()
    {
        return new Iterator< Equipment >()
        {
            @Override
            public boolean hasNext()
            {
                return false;
            }

            @Override
            public Equipment next()
            {
                return null;
            }

            @Override
            public void remove()
            {
            }
        };
    }
}
