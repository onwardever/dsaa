package tech.yangdian.dsaa.ds.pq;

public interface PriorityQueue<T>
{
    void insert(Comparable<T> item);

    T delete();
}
