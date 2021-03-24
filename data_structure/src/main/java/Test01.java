package main.java;

public class Test01 {
    public static void main(String[] args) {
        array();
    }

    public static void array(){
        int[][] a= new int[11][11];
        a[1][2] = 1;
        a[2][3] = 2;

        int count = 0;//计数器，标识有效值的个数。
        System.out.println("初始二维数组");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.printf("%d\t",a[i][j]);
                if (a[i][j] != 0){
                    count++;
                }
            }
            System.out.println();
        }

        System.out.println("稀疏数组");
        int[][] b = new int[count+1][3];
        b[0][0] = 11;
        b[0][1] = 11;
        b[0][2] = count;
        int temp = 0;//计数器，标识行数。
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[i][j] != 0){
                    temp++;
                    b[temp][0] = i;
                    b[temp][1] = j;
                    b[temp][2] = a[i][j];
                }
            }
        }

        for (int i=0;i<b.length;i++){
            for (int j=0;j<b.length;j++){
                System.out.printf("%d\t",b[i][j]);
            }
            System.out.println();
        }

        System.out.println("恢复数组");
        int[][] c = new int[b[0][0]][b[0][1]];
        for (int i = 1;i<b.length;i++){
                c[b[i][0]][b[i][1]] = b[i][2];
        }

        for (int i=0;i<c.length;i++){
            for (int j=0;j<c.length;j++){
                System.out.printf("%d\t",c[i][j]);
            }
            System.out.println();
        }
    }


}
