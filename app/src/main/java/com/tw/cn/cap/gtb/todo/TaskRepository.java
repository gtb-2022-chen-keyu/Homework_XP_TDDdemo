package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public TaskRepository() {
    }

    List<Task> loadTasks() {
        final List<String> lines = readTaskLines();
        final List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            //字符串拼接,小的用stringformat，大量用stringbuilder
            //让此方法只有一个职责,所以再次提取细节
            //String line = lines.get(i);//+ Task 01
            //Task task = TaskFactory.createTask(i+1,lines.get(i));
            tasks.add(TaskFactory.createTask(i+1,lines.get(i)));
        }
        return tasks;
    }

    List<String> readTaskLines() {
        try {
            return Files.readAllLines(Constants.TASKS_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}