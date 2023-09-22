package edu.laplateforme.jour5.services;

import edu.laplateforme.jour5.entities.Person;
import edu.laplateforme.jour5.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;


    public Optional<Person> PersonById(long id) {
        return this.personRepository.findById(id);
    }

    public List<Person> AllPerson() {
        return this.personRepository.findAll();
    }

    public void NewPerson(Person newPerson) { this.personRepository.save(newPerson); }

    public void DeletePerson(long id) {
        this.personRepository.deleteById(id);
    }
}
