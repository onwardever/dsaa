package tech.yangdian.dsaa.ds.pq;

public interface MinHeap<T> extends PriorityQueue<T>
{
    T deleteMin();
}
