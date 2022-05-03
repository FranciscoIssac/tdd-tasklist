package edu.uaslp.objetos.taskslist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class TaskList {
    private List<Task> tasks = new ArrayList<>();
    private int size;

    public void add(Task task) {
        tasks.add(task);
        size++;
    }

    public void remove(Task task) {
        tasks.remove(task);
        size--;
    }

    public Task find(String title) {
        for (Task task : tasks) {
            if (Objects.equals(task.getTitle(), title)) {
                return task;
            }
        }

        throw new TaskNotFoundException();
    }

    public void markAsDone(String title) {
        for (Task task : tasks) {
            if (Objects.equals(task.getTitle(), title)) {
                task.setDone(true);
            }
        }
    }

    public void markAsNotDone(String title) {
        for (Task task : tasks) {
            if (Objects.equals(task.getTitle(), title)) {
                task.setDone(false);
            }
        }
    }

    public Task getNextTask() {
        Iterator<Task> iterator = tasks.iterator();
        iterator.next();

        return iterator.next();
    }

    public List<Task> getNextTasks() {
        List<Task> undoneTasks = new ArrayList<>();
        for (Task task : tasks) {
            if(!task.isDone()) {
                undoneTasks.add(task);
            }
        }

        return undoneTasks;
    }

    public int getSize() {
        return size;
    }
}
