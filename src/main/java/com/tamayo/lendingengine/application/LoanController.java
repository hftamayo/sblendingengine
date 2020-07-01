package com.tamayo.lendingengine.application;

import com.tamayo.lendingengine.application.model.LoanRequest;
import com.tamayo.lendingengine.domain.model.User;
import com.tamayo.lendingengine.domain.repository.LoanRequestRepository;
import com.tamayo.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    private final LoanRequestRepository loanRequestRepository;
    private final UserRepository userRepository;

    //verifica si hay algun bean solicitando LoanController para crear la instancia
    @Autowired
    public LoanController(LoanRequestRepository loanRequestRepository, UserRepository userRepository) {
        this.loanRequestRepository = loanRequestRepository;
        this.userRepository = userRepository;
    }

    //anotacion para informar que el controller usara el metodo post de http
    //RequestBody mapea el request con la clase LoanRequest
    @PostMapping(value = "/loan/request")
    public void requestLoan(@RequestBody final LoanRequest loanApplication){

        System.out.println(loanApplication);
    }

    @GetMapping(value = "/users")
    public List<User> findUsers(){
        return userRepository.findAll();
    }

}
