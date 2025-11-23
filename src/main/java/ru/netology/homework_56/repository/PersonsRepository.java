package ru.netology.homework_56.repository;

import jakarta.persistence.EntityManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.homework_56.model.Person;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PersonsRepository extends CrudRepository<Person, Long> {
    List<Person> getPersonByCityOfLiving(String cityOfLiving);
}
