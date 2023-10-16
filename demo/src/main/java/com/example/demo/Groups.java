package java.com.example.demo;

import java.util.List;
import java.util.ArrayList;
import java.com.example.demo.Persons;

public class Groups {
    private List<Group> groups;
    private String name;
    private List<Person> persons;

    public Group(Long id, String name, List<Person> persons) {
        this.id = id;
        this.name = name;
        this.persons = persons;
    }

    //Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}