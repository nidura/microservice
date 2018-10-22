package com.kyc.agent.service;

import com.kyc.agent.model.Person;
import com.kyc.agent.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nidura Prageeth
 * Date : 2018-10-20
 */
@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    RestTemplate restTemplate;

    public Person findPersonByNic(String nic) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Person>  responseEntity = restTemplate.exchange("http://localhost:9003/client/person/" + nic, HttpMethod.GET, entity, Person.class);
        return responseEntity.getBody();
    }
}
