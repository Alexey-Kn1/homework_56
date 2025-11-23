package ru.netology.homework_56.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.netology.homework_56.model.Person;
import ru.netology.homework_56.repository.PersonsRepository;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonsController {
    private final PersonsRepository repo;

    public PersonsController(PersonsRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/by-city")
    public ResponseEntity<List<Person>> getPersonsByCity(@RequestParam String city) {
        return new ResponseEntity<>(repo.getPersonByCityOfLiving(city), HttpStatus.OK);
    }
}
