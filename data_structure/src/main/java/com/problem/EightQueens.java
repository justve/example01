package main.java.com.problem;

/**
 * 八皇后问题：
 * 在8×8格的国际象棋上摆放8个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，
 * 问有多少种摆法。高斯认为有76种方案。1854年在柏林的象棋杂志上不同的作者发表了40种不同的解，后来有人用图论的方法解出92种结果。
 */
public class EightQueens {
    int maxSize = 8;
    int[] array = new int[maxSize];
    static int count = 0;

    public static void main(String[] args) {
        EightQueens eightQueens = new EightQueens();
        eightQueens.check(0);
        System.out.println(count);
    }

    /**
     * 放置第N个皇后
     * @param n ：第N个皇后
     */
    private void check(int n){
        if (n == maxSize) { //n等于8时，代表八皇后已经放好
            print();
            return;
        }
        /*
        循环：测试每一列是否冲突
        N：代表行数，即第几个皇后
        每放置在一列，便检测是否和之前行的皇后是否冲突。
        若冲突，则回溯至上一行，继续下一列
        若不冲突继续放置下一行。
         */
        for (int i = 0;i<maxSize;i++){
            array[n] = i;
            if (judge(n)) {
                check(n+1);
            }
        }

    }
    /**
     * 判断当前位置（第n个皇后）是否和之前位置冲突
     * @param n ： 第N个皇后
     * @return : 是否和前几行皇后冲突
     * array[i] == array[n] ： 判断是否在同一列
     * Math.abs(array[n] - array[i]) ： 判断是否在同一斜线
     */
    private boolean judge(int n){
        for (int i = 0;i<n;i++){
            if (array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }
    /**
     * 打印每一种解法。
     */
    private void print(){
        count++;//计数，共有多少种解法
        /*
        打印每一种解法
         */
        for (int i = 0;i<maxSize;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
