package com.yicj.study.dao;

import com.yicj.study.entity.TodoItem;
import org.junit.Test;

public class TodoRepositoryTest {

    @Test
    public void testSave(){
        TodoItem item = new TodoItem("test") ;
        TodoRepository repository = new TodoRepository();
        repository.save(item);
    }
}
