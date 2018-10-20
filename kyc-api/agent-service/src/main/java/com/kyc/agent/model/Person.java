package com.kyc.agent.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Nidura Prageeth
 * Date : 2018-10-20
 */
@Entity
public class Person {
    private long indexNo;
    private String personName;
    private String mobileNo;
    private String nic;

    @Id
    @Column(name = "index_no", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(long indexNo) {
        this.indexNo = indexNo;
    }

    @Basic
    @Column(name = "person_name", nullable = true, length = 50)
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Basic
    @Column(name = "mobile_no", nullable = true, length = 50)
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Basic
    @Column(name = "nic", nullable = true, length = 50)
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return indexNo == person.indexNo &&
                Objects.equals(personName, person.personName) &&
                Objects.equals(mobileNo, person.mobileNo) &&
                Objects.equals(nic, person.nic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexNo, personName, mobileNo, nic);
    }
}
