package com.tamayo.lendingengine.application;

import com.tamayo.lendingengine.application.model.LoanRequest;
import com.tamayo.lendingengine.domain.model.LoanApplication;
import com.tamayo.lendingengine.domain.repository.LoanRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanRequestRepository loanRequestRepository;

    //verifica si hay algun bean solicitando LoanController para crear la instancia
    @Autowired
    public LoanController(LoanRequestRepository loanRequestRepository) {
        this.loanRequestRepository = loanRequestRepository;
    }

    //anotacion para informar que el controller usara el metodo post de http
    //RequestBody mapea el request con la clase LoanRequest
    @PostMapping(value = "/loan/request")
    public void requestLoan(@RequestBody final LoanRequest loanApplication){

        System.out.println(loanApplication);
    }

}
