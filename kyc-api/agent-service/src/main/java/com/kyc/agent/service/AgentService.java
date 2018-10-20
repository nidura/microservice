package com.kyc.agent.service;

import com.kyc.agent.model.Person;
import com.kyc.agent.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nidura Prageeth
 * Date : 2018-10-20
 */
@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    public List<Person> findAllPerson() {
        return agentRepository.findAll();
    }

    public Person findPersonByNic(String nic) {
        return agentRepository.findByNic(nic);
    }
}
