package com.tw.cn.cap.gtb.todo;

public class TaskFactory {//面向对象的设计经验：simpleFactory
    //声明一个private的构造函数
    private TaskFactory(){}
    static Task createTask(int id, String line) {
        String[] fields = line.split(" ", 2);
        String name = fields[1]; //拆出来后返回的是一个数组
        final boolean isCompleted=fields[0].equals("x");
        return new Task(id, name, isCompleted);
    }
}