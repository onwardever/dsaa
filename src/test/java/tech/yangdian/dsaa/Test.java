package tech.yangdian.dsaa;

import tech.yangdian.dsaa.ds.tree.AVL;

public class Test
{
    public static void main(String[] args)
    {
        Integer[] integers = {3, 7, 4, 2, 9};

        AVL<Integer> avl = new AVL<>();

        for(int i=0;i<integers.length;i++)
        {
            avl.insert(integers[i]);
        }

        System.out.println(avl.find_min());
        System.out.println(avl.find_max());

    }
}
