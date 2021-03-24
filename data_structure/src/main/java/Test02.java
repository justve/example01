package main.java;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayQueue queue = new ArrayQueue(3);
        while (flag){
            System.out.println("请输入操作代码：");
            System.out.println("a(add):队列中加入数据");
            System.out.println("g(get):取出数据，出队列");
            System.out.println("s(show):显示队列中所有数据");
            System.out.println("f(isfull):判断队列是否已满");
            System.out.println("e(empty):判断队列是否为空");

            String s = scanner.next();
            switch (s){
                case "a":
                    if (queue.isFull()){
                        System.out.println("队列已满····");
                    }
                    System.out.println("请输入数据：");
                    int data = scanner.nextInt();
                    queue.add(data);
                    break;
                case "g":
                    try {
                        int queueData = queue.getQueue();
                        System.out.println(queueData);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "s":
                    queue.show();
                case "f":
                    if (queue.isFull()){
                        System.out.println("队列已满");
                    }
                case "e":
                    if (queue.isEmpty()){
                        System.out.println("队列为空");
                    }

            }
        }
    }
}

/**
 * 队列：顺序存储结构
 */
class ArrayQueue{
    private int maxSize;//定义一个队列的最大容量
    private int front;//定义一个指针，指向队列的队头。
    private int rear;//定义一个指针，指向队列的队尾

    private int[] queue;

    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
    }
    /*
    判断是否为空
     */
    public boolean isEmpty(){
        return front == rear;
    }

    /*
    判断队列是否已满
     */
    public boolean isFull(){
        return rear == maxSize-1;
    }

    /*
    向队列中添加数据
     */
    public void add(int data){
        if (isFull()){
            System.out.println("队列已满，无法继续添加数据...");
            return;
        }
        rear++;
        queue[rear] = data;
    }

    /*
    出队列
     */
    public int getQueue(){
        if (isEmpty()){
            throw  new RuntimeException("队列为空，没有数据...");
        }
        front++;
        int head = queue[front];

        return head;
    }

    /*
    显示队列中所以数据
     */
    public void show() {
        if (isEmpty()) {
            throw new RuntimeException("当前队列为空，没有数据...");
        }
        for (int x : queue){
            System.out.printf("%d\t",x);
        }
    }
}