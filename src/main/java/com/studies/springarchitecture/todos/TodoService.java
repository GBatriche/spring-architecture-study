package com.studies.springarchitecture.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity save(TodoEntity newTodo){
        return repository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo){
        repository.save(todo);
    }

    public TodoEntity searchById(Integer id){
        return repository.findById(id).orElse(null);
    }

}
