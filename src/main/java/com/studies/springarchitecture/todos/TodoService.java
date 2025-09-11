package com.studies.springarchitecture.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository,
                       TodoValidator validator,
                       MailSender mailSender
                       ){
        this.repository = todoRepository;
        this.mailSender = mailSender;
        this.validator = validator;
    }

    public TodoEntity save(TodoEntity newTodo){
        validator.validate(newTodo);
        return repository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo){
        repository.save(todo);
        String status = todo.getConcluded() == Boolean.TRUE ? "Concluído" : "Não concluído";
        mailSender.send("ToDo " + todo.getDescription() + "foi atualizado para " + status);
    }

    public TodoEntity searchById(Integer id){
        return repository.findById(id).orElse(null);
    }

}
