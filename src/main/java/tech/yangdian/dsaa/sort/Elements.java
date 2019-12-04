package tech.yangdian.dsaa.sort;

public abstract class Elements<E, T extends Elements<E, T>>
{
    protected E elements;

    public T setElements(E elements)
    {
        this.elements = elements;
        return (T) this;
    }
}
