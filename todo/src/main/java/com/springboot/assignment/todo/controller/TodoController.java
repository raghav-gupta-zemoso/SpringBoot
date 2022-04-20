package com.springboot.assignment.todo.controller;
import com.springboot.assignment.todo.entity.TodoItem;
import com.springboot.assignment.todo.repository.TodoRepo;
import com.springboot.assignment.todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoServiceImpl todoServiceImpl;

    @Autowired
    public TodoController(TodoServiceImpl theTodoServiceImpl) {
        todoServiceImpl = theTodoServiceImpl;
    }

    @GetMapping("/tasks")
    public List<TodoItem> findAll(){
        return  todoServiceImpl.findAll();
    }
    @GetMapping("/tasks/{id}")
    public TodoItem getTask(@PathVariable int id)
    {
        TodoItem item = todoServiceImpl.findById(id);
        if (item == null) {
            throw new RuntimeException("task id not found - " + id);
        }
        return item;
    }

    @PostMapping("/tasks")
    public TodoItem save(@RequestBody TodoItem todoItem){
        todoItem.setId(0);
        todoServiceImpl.save(todoItem);
        return todoItem;

    }
    @DeleteMapping("/tasks/{id}")
    public String deleteItem(@PathVariable int id){
        TodoItem tempItem = todoServiceImpl.findById(id);
        if (tempItem == null) {
            throw new RuntimeException("item id not found - " + tempItem);
        }
        todoServiceImpl.deleteById(id);
        return "Deleted task id - " + id;
    }

}
