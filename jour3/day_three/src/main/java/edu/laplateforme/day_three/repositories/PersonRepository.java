package edu.laplateforme.day_three.repositories;

import edu.laplateforme.day_three.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
