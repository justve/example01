package main.java.com.sorting;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 选择排序
 */
public class SelectSorting {
    public static void main(String[] args) {
//        int[] array = {6, 2, 4, 1, -3, 7, 5};
        //测试当数组大小为max，时，冒泡排序算法所需花费的时间
        int max = 800000;
        int[] a = new int[max];

        for (int i = 0;i<max;i++){
            a[i] = (int) (Math.random()*800000);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD hh-mm-ss");
        String format = simpleDateFormat.format(date);
        System.out.println("排序前 ："+format);
        selectSort(a);
        Date date1 = new Date();
        String format1 = simpleDateFormat.format(date1);
        System.out.println("排序后 ："+format1);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(array));
    }
    public static void selectSort(int[] arr){
        int minIndex = 0;
        int min = 0;
        for (int i = 0;i<arr.length-1;i++){//代表轮数，每一轮结束确定最小值
            min = arr[i];
            for (int j = i+1;j<arr.length;j++){//比较当前数与剩余数，取出最小值与当前数进行交换
                if (min>arr[j]){
                    min = arr[j];//重置最小值
                    minIndex = j;//重置最小值的下标
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

//            System.out.println("第"+(i+1)+"轮 ："+Arrays.toString(arr));
        }
    }
}
