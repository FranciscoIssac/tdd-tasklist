package edu.uaslp.objetos.taskslist;

public class TaskNotFoundException extends RuntimeException{
    public TaskNotFoundException() {
        super("Task with title 'Hacer ejercicio' not found");
    }
}
