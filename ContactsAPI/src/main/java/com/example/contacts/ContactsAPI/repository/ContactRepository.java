package com.example.contacts.ContactsAPI.repository;

import com.example.contacts.ContactsAPI.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> { }