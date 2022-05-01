package com.company;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue()
    {
        super(); //it will call Custom Stack constructor w/o parameter one
    }
    public DynamicQueue(int size)
    {
        super(size); //it will call Custom Stack constructor with parameter one
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull())
        {
            //double size of array
            int[] temp = new int[data.length*2];

            //copy all previous elements of data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)/ data.length] ;
            }
            front = 0 ;
            end = data.length;
            data = temp ;
        }

        return super.insert(item);
    }
}
