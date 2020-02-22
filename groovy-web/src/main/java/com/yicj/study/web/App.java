package com.yicj.study.web;

import com.yicj.study.dao.TodoRepository;
import com.yicj.study.entity.TodoItem;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int i = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        while (++i > 0){
            System.out.println(i + ". please input todu item name");
            TodoItem item = new TodoItem(scanner.nextLine()) ;
            TodoRepository repository = new TodoRepository() ;
            repository.save(item);
        }

    }
}
