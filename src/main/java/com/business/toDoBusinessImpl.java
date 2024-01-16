package com.business;
import com.business.data.toDoService;

import java.util.ArrayList;
import java.util.List;

public class toDoBusinessImpl {
    private toDoService todoService_;
    toDoBusinessImpl(toDoService todoService_){
        this.todoService_ = todoService_;
    }
    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> allTodos = todoService_.retrieveTodos(user);
        for (String todo : allTodos) {
            if (todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
