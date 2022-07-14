package com.tw.cn.cap.gtb.todo;

public class Task {
    private final int id;
    private final String name;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //常见重构手法，移到Task里面去
    String format() {
        return String.format("%d %s", getId(), getName());
    }
}
