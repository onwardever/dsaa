package tech.yangdian.dsaa.sort.insertion;

import tech.yangdian.dsaa.sort.Elements;

public class IntInsertionSort extends Elements<int[], IntInsertionSort> implements InsertionSort
{
    @Override
    public void sort(Type type)
    {
        int j;
        int cur;

        for (int p = 1; p < elements.length; p++)
        {
            cur = elements[p];

            for (j = p; j > 0 && !type.fit(elements[j - 1], cur); j--)
            {
                elements[j] = elements[j - 1];
            }

            elements[j] = cur;
        }
    }
}
