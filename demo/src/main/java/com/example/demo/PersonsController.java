package com.example.demo;

import com.example.demo.Persons;
import com.example.demo.Groups;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class PersonController {

    private List<Person> persons = // Inicializa tu lista de personas aquí

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return persons;
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return persons.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping("/persons/groups/{id}")
    public List<Group> getGroupsByPersonId(@PathVariable Long id) {
        Person person = getPersonById(id);
        if (person != null) {
            return person.getGroups();
        }
        return null;
    }
}