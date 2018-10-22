package com.kyc.agent.controller;

import com.kyc.agent.model.Person;
import com.kyc.agent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Nidura Prageeth
 * Date : 2018-10-20
 */
@RestController
@RequestMapping("/agent/")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping("person/{nic}")
    public Person findPersonByNic(@PathVariable("nic") String nic){
        return agentService.findPersonByNic(nic);
    }
}
