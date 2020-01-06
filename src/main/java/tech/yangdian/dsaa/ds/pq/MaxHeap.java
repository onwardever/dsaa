package tech.yangdian.dsaa.ds.pq;

public interface MaxHeap<T> extends PriorityQueue<T>
{
    T deleteMax();
}
