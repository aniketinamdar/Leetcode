package com.company;

import java.util.ArrayList;

public class ReturnListWithoutArguments {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,3,3};
        System.out.println(find_index(arr,3,0));
    }
    static ArrayList<Integer> find_index(int[] arr, int target , int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
        {
            return list;
        }
        if (arr[index] == target)
        {
            list.add(index);
        }
        ArrayList<Integer> ans = find_index(arr,target,index+1);
        list.addAll(ans);
        return list;
    }

}
