package main.java.com.sorting;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * \
 * ，冒泡排序：每一趟挑出最大的数，下一趟排序时取出最大的数.
 */
public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = {6, 2, 4, 1, -3, 7, 5};
        //测试当数组大小为max，时，冒泡排序算法所需花费的时间
        int max = 80000;
        int[] a = new int[max];

        for (int i = 0;i<max;i++){
            a[i] = (int) (Math.random()*800000);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD hh-mm-ss");
        String format = simpleDateFormat.format(date);
        System.out.println("排序前 ："+format);
        bubbleSort(a);
        Date date1 = new Date();
        String format1 = simpleDateFormat.format(date1);
        System.out.println("排序后 ："+format1);
//        System.out.println(Arrays.toString(array));
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {//控制几趟
            for (int j = 0; j < arr.length - 1 - i; j++) {//控制相邻两数比较大小，按顺序交换位置
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }
}
