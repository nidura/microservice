package com.kyc.agent.repository;

import com.kyc.agent.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Nidura Prageeth
 * Date : 2018-10-20
 */
@Repository
public interface AgentRepository extends JpaRepository<Person, Long> {


    Person findByNic(String nic);
}