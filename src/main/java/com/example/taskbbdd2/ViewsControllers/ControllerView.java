package com.example.taskbbdd2.ViewsControllers;

import com.example.taskbbdd2.Controller.TaskController;

public abstract class ControllerView {
    protected TaskController taskController;

    public void setTaskController(TaskController taskController) {
        this.taskController = taskController;
    }
}
