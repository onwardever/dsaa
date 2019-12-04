package tech.yangdian.dsaa.sort;

import tech.yangdian.dsaa.sort.insertion.InsertionSortBuilder;
import tech.yangdian.dsaa.sort.merge.MergeSortBuilder;

public class SortBuilders
{
    public static MergeSortBuilder merge()
    {
        return MergeSortBuilder.INST;
    }

    public static InsertionSortBuilder insertion()
    {
        return InsertionSortBuilder.INST;
    }
}
