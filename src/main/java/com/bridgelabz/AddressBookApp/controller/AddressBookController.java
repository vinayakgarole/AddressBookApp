package com.bridgelabz.AddressBookApp.controller;

import com.bridgelabz.AddressBookApp.dto.ContactDTO;
import com.bridgelabz.AddressBookApp.model.Contacts;
import com.bridgelabz.AddressBookApp.services.IAddressBook;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/AddressBook")
public class AddressBookController {

    @Autowired
    private IAddressBook iAddressBook;

    @PostMapping("/save")
    public Contacts addContact(@Valid @RequestBody ContactDTO contactDTO) {
        return iAddressBook.addContact(contactDTO);
    }

    @GetMapping("/Get/{id}")
    public Optional<Contacts> getContactsById(@PathVariable int id) {
        return iAddressBook.getContactByID(id);
    }

    @GetMapping("/GetAll")
    public List<Contacts> getAllContacts(){
        return iAddressBook.getAllContact();
    }

    @PutMapping("Edit/{id}")
    public Contacts editContactById(@Valid @RequestBody ContactDTO contactDTO, @PathVariable int id) {
        return iAddressBook.updateContactDetailsByID(contactDTO, id);
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteContactById(@PathVariable int id) {
        return iAddressBook.deleteContactByID(id);
    }

    @DeleteMapping("/DeleteAll")
    public String deleteAllContacts() {
        return iAddressBook.deleteAllContact();
    }
}
