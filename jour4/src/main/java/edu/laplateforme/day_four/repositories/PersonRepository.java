package edu.laplateforme.day_four.repositories;

import edu.laplateforme.day_four.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
