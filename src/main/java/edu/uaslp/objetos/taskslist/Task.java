package edu.uaslp.objetos.taskslist;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class Task {
    private String title;
    private String description;
    private boolean done;
    private LocalDateTime DueDate;

    public Task(String title, String description, LocalDateTime DueDate, boolean done) {
        this.title = title;
        this.description = description;
        this.DueDate = DueDate;
        this.done = done;
    }

    public Task() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(LocalDateTime DueDate) {
        if (DueDate.isAfter(LocalDateTime.now())) {
            this.DueDate = DueDate;
        } else {
            throw new TaskListException();
        }
    }

    public void setDone(boolean realizada) {
        this.done = realizada;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDueDate() {
        return DueDate;
    }

    public boolean isDone() {
        return done;
    }

}
