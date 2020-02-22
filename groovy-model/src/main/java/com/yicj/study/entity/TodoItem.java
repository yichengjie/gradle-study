package com.yicj.study.entity;


import lombok.Data;

@Data
public class TodoItem {
    private String name ;
    private boolean hasDone ;
    public TodoItem(String name){
        this.name = name ;
    }

}
