package tech.yangdian.dsaa.sort.merge;

public class MergeSortBuilder
{
    public static final MergeSortBuilder INST = new MergeSortBuilder();

    private MergeSortBuilder() {}

    public IntMergeSort support(int[] elements)
    {
        return new IntMergeSort().setElements(elements);
    }

    public LongMergeSort support(long[] elements)
    {
        return new LongMergeSort().setElements(elements);
    }

    public FloatMergeSort support(float[] elements)
    {
        return new FloatMergeSort().setElements(elements);
    }

    public DoubleMergeSort support(double[] elements)
    {
        return new DoubleMergeSort().setElements(elements);
    }
}
