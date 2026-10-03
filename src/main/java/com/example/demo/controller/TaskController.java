package com.example.demo.controller;
import com.example.demo.dto.TaskRequest;
import com.example.demo.dto.TaskResponse;
import com.example.demo.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bing.annotation.*;

@RestConrtoller
@RequestMapping("/api/v1/task")

public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }
    @PostMapping
    public ResponseEntity<TaskResponce> createTask (@RequestBody TaskRequest request){
        var taskId = taskService.registerNewTask();

        TaskResponse response = new TaskResponse (
                taskId,
        )
    }
}
