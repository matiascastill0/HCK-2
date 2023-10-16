package com.example.demo;

import java.util.List;

public class PersonsController {
    private Persons persons;

    public PersonsController() {
        this.persons = new Persons();
    }

    public void addPerson(String name, int age) {
        Person person = new Person(name, age);
        persons.addPerson(person);
    }

    public List<Person> getAllPersons() {
        return persons.getPersons();
    }

    public static void main(String[] args) {
        PersonsController controller = new PersonsController();
        controller.addPerson("John Doe", 30);
        List<Person> allPersons = controller.getAllPersons();
        for (Person person : allPersons) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
