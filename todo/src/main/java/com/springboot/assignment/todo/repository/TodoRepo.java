package com.springboot.assignment.todo.repository;

import com.springboot.assignment.todo.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem,Integer> {

}
