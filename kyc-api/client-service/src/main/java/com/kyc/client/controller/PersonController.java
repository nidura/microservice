package com.kyc.client.controller;

import com.kyc.client.model.Person;
import com.kyc.client.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Nidura Prageeth
 * Date : 2018-10-22
 */
@RestController
@RequestMapping("/client/")
public class PersonController {

    @Autowired
    private PersonService personService;


    @GetMapping("person")
    public List<Person> findAllPerson(){
        return personService.findAllPerson();
    }

    @GetMapping("person/{nic}")
    public Person findPersonByNic(@PathVariable("nic") String nic){
        return personService.findPersonByNic(nic);
    }
}
