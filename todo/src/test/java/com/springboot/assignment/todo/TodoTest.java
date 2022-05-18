package com.springboot.assignment.todo;

import com.springboot.assignment.todo.entity.TodoItem;
import com.springboot.assignment.todo.repository.TodoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class TodoTest {

    @Autowired
    private TodoRepo repo;

    @Test
    public void testFindAllTask(){
        repo.findAll();
    }
    @Test
    public void testCreateTask()
    {
        TodoItem item=new TodoItem(4,"pqrs","yes");
        repo.save(item);
    }

    @Test
    public void testFindTaskById()
    {
        Integer i=1;
       Optional<TodoItem> item=repo.findById(i);
         item.get().getTitle();
    }

    @Test
    public void testDeleteTaskById(){
        Integer i=3;
        repo.deleteById(i);
    }

}
