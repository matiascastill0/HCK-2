package java.com.example.demo;

import java.util.List;
import java.util.ArrayList;

public class Persons {
    private List<Person> persons;

    public Id() {
        ids = new ArrayList<>();
    }
    
    public Persons() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }
}

