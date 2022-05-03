package edu.uaslp.objetos.taskslist;

public class TaskListException extends RuntimeException{
    public TaskListException() {
        super("Due date is set in the past");
    }
}
