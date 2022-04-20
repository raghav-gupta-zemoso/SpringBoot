package com.springboot.assignment.todo.service;

import com.springboot.assignment.todo.entity.TodoItem;

import java.util.List;

public interface TodoService {
    public List<TodoItem> findAll();
    public TodoItem findById(int theId);
    public void save(TodoItem todoItem);
    public void deleteById(int theId);
}
