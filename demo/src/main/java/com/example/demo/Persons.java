package java.com.example.demo;

import java.util.List;
import java.util.ArrayList;
import java.com.example.demo.Groups;

public class Persons {
    private List<Person> persons;
    private String name;
    private List<Group> groups;

    public Persons(Long id, String name, List<Group> groups) {
        this.id = id;
        this.name = name;
        this.groups = groups;
    }

    //Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }   

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}
```

