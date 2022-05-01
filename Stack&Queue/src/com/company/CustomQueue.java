package com.company;

public class CustomQueue {
    private int[] data ;
    private static final int DEFAULT_SIZE = 10 ;

    int end = 0 ;
    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }
    public boolean isFull()
    {
        if (end==data.length)//ptr at last index
        {
            return true;
        }
        return false;
    }
    private boolean isEmpty()
    {
        if (end==0)
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
        return true;
    }
    public int remove() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Queue is empty!!");
        }
        int removed = data[0];

        //shift all items
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Queue is empty!!");
        }
        return data[0];
    }
    public void display()
    {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }
}
