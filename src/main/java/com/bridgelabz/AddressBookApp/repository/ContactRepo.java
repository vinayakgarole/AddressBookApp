package com.bridgelabz.AddressBookApp.repository;

import com.bridgelabz.AddressBookApp.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<Contacts,Integer> {
}