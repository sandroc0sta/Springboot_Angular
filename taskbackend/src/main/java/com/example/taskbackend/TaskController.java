package com.example.taskbackend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public List<Task> getTasks() {
        return List.of(
            new Task(1, "Learn Angular", false),
            new Task(2, "Learn Spring Boot", true)
        );
    }
}

class Task{
    private int id;
    private String title;
    private boolean completed;

    public Task(int id, String title, boolean completed){
        this.id=id;
        this.title=title;
        this.completed=completed;
    }

    public int getId(){return id;}
    public String getTitle(){return title;}
    public boolean getCompleted(){return completed;}
}