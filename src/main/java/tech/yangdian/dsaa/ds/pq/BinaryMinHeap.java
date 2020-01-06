package tech.yangdian.dsaa.ds.pq;

public class BinaryMinHeap<T> implements MinHeap<T>
{
    private Comparable<T>[] elements;

    public BinaryMinHeap(int size)
    {
        this.elements = new Comparable[size];
    }


    @Override
    public T deleteMin()
    {
        return null;
    }

    @Override
    public void insert(Comparable<T> item)
    {

    }

    @Override
    public T delete()
    {
        return null;
    }
}
