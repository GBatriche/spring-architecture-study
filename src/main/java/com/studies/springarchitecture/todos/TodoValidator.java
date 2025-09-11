package com.studies.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validate(TodoEntity todo){
        if (decriptionTodoExists(todo.getDescription())){
            throw new IllegalArgumentException("Já existe todo com essa descrição");
        }
    }

    private boolean decriptionTodoExists(String description){
        return repository.existsByDescription(description);
    }
}
