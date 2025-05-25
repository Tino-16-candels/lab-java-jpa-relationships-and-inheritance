package com.ironhack.labweek8.repository;
import com.ironhack.labweek8.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
//
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
