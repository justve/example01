package main.java.com.sorting;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 插入排序
 */
public class InsertSorting {
    public static void main(String[] args) {
//        int[] array = {6, 2, 4, 1, -3, 7, 5};
//        insertSort(array);
//        System.out.println(Arrays.toString(array));
        int max = 800000;
        int[] a = new int[max];

        for (int i = 0;i<max;i++){
            a[i] = (int) (Math.random()*800000);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD hh-mm-ss");
        String format = simpleDateFormat.format(date);
        System.out.println("排序前 ："+format);
        insertSort(a);
        Date date1 = new Date();
        String format1 = simpleDateFormat.format(date1);
        System.out.println("排序后 ："+format1);
//        System.out.println(Arrays.toString(a));
    }
    public static void insertSort(int[] arr){
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1;i<arr.length;i++){
            insertIndex = i-1;
            insertVal = arr[i];
            while (insertIndex >= 0 && insertVal < arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex+1] = insertVal;
            }
        }
    }
}
