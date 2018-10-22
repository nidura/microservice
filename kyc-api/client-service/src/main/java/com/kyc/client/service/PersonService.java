package com.kyc.client.service;

import com.kyc.client.model.Person;
import com.kyc.client.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nidura Prageeth
 * Date : 2018-10-22
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person findPersonByNic(String nic){
        return personRepository.findByNic(nic);
    }

    public List<Person> findAllPerson() {
        return personRepository.findAll();
    }
}
