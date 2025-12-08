package com.example.menakade;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private List<Todo> todoList = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    @GetMapping
    public List<Todo> getAll() {
        return todoList;
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        todo.setId(counter.incrementAndGet());
        todoList.add(todo);
        return todo;
    }

    @DeleteMapping("/api/todos/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoList.removeIf(t -> t.getId().equals(id));
    }
}