package tech.yangdian.dsaa.sort.insertion;

import tech.yangdian.dsaa.sort.SortItem;

public class InsertionSortBuilder
{
    public static final InsertionSortBuilder INST = new InsertionSortBuilder();

    private InsertionSortBuilder() {}

    public IntInsertionSort support(int[] elements)
    {
        return new IntInsertionSort().setElements(elements);
    }

    public LongInsertionSort support(long[] elements)
    {
        return new LongInsertionSort().setElements(elements);
    }

    public FloatInsertionSort support(float[] elements)
    {
        return new FloatInsertionSort().setElements(elements);
    }

    public DoubleInsertionSort support(double[] elements)
    {
        return new DoubleInsertionSort().setElements(elements);
    }

    public ItemInsertionSort support(SortItem[] elements)
    {
        return new ItemInsertionSort().setElements(elements);
    }
}
