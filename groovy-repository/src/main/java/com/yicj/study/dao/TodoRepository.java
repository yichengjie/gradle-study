package com.yicj.study.dao;

import com.yicj.study.entity.TodoItem;
import java.util.ArrayList;
import java.util.List;

public class TodoRepository {

    private static List<TodoItem> items = new ArrayList<>();

    public void save(TodoItem item){
        items.add(item) ;
        System.out.println("save ..." + item);
    }
}