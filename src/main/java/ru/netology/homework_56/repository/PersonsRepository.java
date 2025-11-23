package ru.netology.homework_56.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.homework_56.model.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends CrudRepository<Person, Long> {
    @Query("select p from Person p where p.cityOfLiving = :cityOfLiving")
    List<Person> getPersonsByCity(String cityOfLiving);

    @Query("select p from Person p where p.age < :age")
    List<Person> getPersonsYoungerThan(short age);

    @Query("select p from Person p where p.name = :name and p.surname = :surname")
    Optional<Person> searchPersons(String name, String surname);
}
