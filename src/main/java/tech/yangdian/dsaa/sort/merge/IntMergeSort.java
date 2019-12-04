package tech.yangdian.dsaa.sort.merge;

import tech.yangdian.dsaa.sort.Elements;

public class IntMergeSort extends Elements<int[],IntMergeSort> implements MergeSort
{
    @Override
    public void sort(Type type)
    {
        int[] temp = new int[elements.length];

        mergeSort(elements, temp, 0, elements.length - 1, type);
    }

    private void mergeSort(int[] elements, int[] temp, int from, int end, Type type)
    {
        if (from < end)
        {
            int center = (from + end) / 2;

            mergeSort(elements, temp, from, center, type);
            mergeSort(elements, temp, center + 1, end, type);

            merge(elements, temp, from, center + 1, end, type);
        }
    }

    private void merge(int[] elements, int[] temp, int lpos, int rpos, int rend, Type type)
    {
        int pos = lpos;
        int lend = rpos - 1;
        int size = rend - lpos + 1;

        while (lpos <= lend && rpos <= rend)
        {
            if (type.fit(elements[lpos], elements[rpos]))
            {
                temp[pos++] = elements[lpos++];
            }
            else
            {
                temp[pos++] = elements[rpos++];
            }
        }

        while (lpos <= lend)
        {
            temp[pos++] = elements[lpos++];
        }

        while (rpos <= rend)
        {
            temp[pos++] = elements[rpos++];
        }

        for (int i = 0; i < size; i++, rend--)
        {
            elements[rend] = temp[rend];
        }
    }
}
