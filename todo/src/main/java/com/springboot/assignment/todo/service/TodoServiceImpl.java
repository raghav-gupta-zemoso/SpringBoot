package com.springboot.assignment.todo.service;

import com.springboot.assignment.todo.entity.TodoItem;
import com.springboot.assignment.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService{

    private TodoRepo todoRepo;

    @Autowired
    public TodoServiceImpl(TodoRepo theTodoRepo) {
        todoRepo = theTodoRepo;
    }

    @Override
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }

    @Override
    public TodoItem findById(int theId) {
        Optional<TodoItem> result = todoRepo.findById(theId);

        TodoItem items = null;

        if (result.isPresent()) {
            items = result.get();
        }
        else {

            throw new RuntimeException("Did not find task id - " + theId);
        }

        return items;
    }

    @Override
    public void save(TodoItem todoItem) {
       todoRepo.save(todoItem);
    }

    @Override
    public void deleteById(int theId) {
        todoRepo.deleteById(theId);
    }
}
