package ru.netology.homework_56.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.homework_56.model.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends CrudRepository<Person, Long> {
    List<Person> getPersonByCityOfLiving(String cityOfLiving);

    List<Person> getPersonByAgeLessThan(short age);

    Optional<Person> getPersonByNameAndSurname(String name, String surname);
}
