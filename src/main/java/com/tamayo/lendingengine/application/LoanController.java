package com.tamayo.lendingengine.application;

import com.tamayo.lendingengine.domain.model.LoanRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    //anotacion para informar que el controller usara el metodo post de http
    //RequestBody mapea el request con la clase LoanRequest
    @PostMapping(value = "/loan/request")
    public void requestLoan(@RequestBody final LoanRequest loanRequest){
        System.out.println(loanRequest);
    }

}
