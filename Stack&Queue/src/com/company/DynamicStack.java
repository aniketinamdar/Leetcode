package com.company;

public class DynamicStack extends CustomStack{
    public DynamicStack()
    {
        super(); //it will call Custom Stack constructor w/o parameter one
    }
    public DynamicStack(int size)
    {
        super(size); //it will call Custom Stack constructor with parameter one
    }

    @Override
    public boolean push(int item) {
        if (this.isFull())
        {
            //double size of array
            int[] temp = new int[data.length*2];

            //copy all previous elements of data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i] ;
            }
            data = temp ;
        }
        //insert item
        return super.push(item);
    }
}
