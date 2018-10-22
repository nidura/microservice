package com.kyc.client.repository;

import com.kyc.client.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Nidura Prageeth
 * Date : 2018-10-22
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    Person findByNic(String nic);
}
