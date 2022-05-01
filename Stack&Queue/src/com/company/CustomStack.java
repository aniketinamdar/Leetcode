package com.company;

public class CustomStack {
   protected int[] data ;
   private static final int DEFAULT_SIZE = 10 ;
   int ptr = -1  ;

   public CustomStack()
   {
      this(DEFAULT_SIZE);
   }
   public CustomStack(int size)
   {
      this.data = new int[size] ;
   }
   public boolean push(int item)
   {
      if (isFull())
      {
         System.out.println("Stack is Full!");
         return false;
      }
      ptr++;
      data[ptr] = item ;
      return true;
   }
   public int pop() throws StackException {
      if (isEmpty())
      {
         throw new StackException("Empty Stack");
      }
      int removed = data[ptr];
      ptr--;
      return removed;
   }
   public int peek() throws Exception
   {
      if (isEmpty())
      {
         throw new Exception("Empty Stack");
      }
      return data[ptr];
   }
   public boolean isFull()
   {
      if (ptr==data.length-1)//ptr at last index
      {
         return true;
      }
      return false;
   }
   private boolean isEmpty()
   {
      if (ptr==-1)
      {
         return true;
      }
      return false;
   }

}
