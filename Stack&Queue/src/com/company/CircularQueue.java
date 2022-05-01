package com.company;

public class CircularQueue {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10 ;

    int front = 0 ;
    int end = 0 ;
    int size = 0 ;
    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size)
    {
        this.data = new int[size];
    }
    public boolean isFull()
    {
        if (size==data.length)//ptr at last index
        {
            return true;
        }
        return false;
    }
    private boolean isEmpty()
    {
        if (size==0)
        {
            return true;
        }
        return false;
    }
    public boolean insert(int item)
    {
        if (isFull())
        {
            System.out.println("Queue is full");
            return false;
        }
        data[end] = item ;
        end++;
        end = end % data.length ;
        size++;
        return true;
    }
    public int remove() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Queue is empty!!");
        }
        int removed = data[front];
        front++;
        front = front % data.length ;
        size--;
        return removed;
    }
    public int front() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Queue is empty!!");
        }
        return data[front];
    }
    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        int i = front ;
        do
        {
            System.out.print(data[i]+" ");
            i++;
            i = i % data.length;
        }while (i!=end);
        System.out.println("END");
    }
}
