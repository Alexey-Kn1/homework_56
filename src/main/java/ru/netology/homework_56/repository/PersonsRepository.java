package ru.netology.homework_56.repository;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import ru.netology.homework_56.model.Person;

import java.util.List;

@Repository
public class PersonsRepository {
    private final EntityManager db;

    public PersonsRepository(EntityManager manager) {
        this.db = manager;
    }

    public Person save(Person p) {
        db.persist(p);
        return p;
    }

    public List<Person> getPersonsByCity(String city) {
        var query = db.createQuery("from Person where cityOfLiving = :city_name", Person.class);

        query.setParameter("city_name", city);

        var res = query.getResultList();

        System.out.println(res);

        return res;
    }
}
