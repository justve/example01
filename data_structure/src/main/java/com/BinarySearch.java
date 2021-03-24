package main.java.com;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,6,7,8,9,10};
        ArrayList<Integer> integers = binarySearch(arr, 0, arr.length - 1, 5);
        System.out.println(integers);
    }
    public static ArrayList<Integer> binarySearch(int[] array,int left,int right,int findValue){
        if (left > right) {
            return new ArrayList<>();
        }
        int middle = (left + right) / 2;
        int midValue = array[middle];
        ArrayList<Integer> list = new ArrayList<Integer>();
        //向左递归
        if (array[middle] > midValue) {
            binarySearch(array,left,middle - 1,findValue);
        }else if (array[middle] < midValue){
            binarySearch(array,middle + 1,right,findValue);
        }else {
            int temp = middle-1;
            while (temp > 0 && array[temp] == midValue) {
                list.add(temp);
                temp -= 1;
            }
            list.add(middle);
            while (temp < array.length - 1 && array[temp] == midValue) {
                list.add(temp);
                temp += 1;
            }
        }
        return list;
    }
}
