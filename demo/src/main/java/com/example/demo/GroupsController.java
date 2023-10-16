package com.example.demo;

import com.example.demo.model.Persons;
import com.example.demo.model.Groups;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GroupController {

    private List<Group> groups = // Inicializa tu lista de grupos aquí

    @GetMapping("/groups")
    public List<Group> getAllGroups() {
        return groups;
    }

    @GetMapping("/groups/{id}")
    public Group getGroupById(@PathVariable Long id) {
        return groups.stream().filter(g -> g.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping("/groups/persons/{id}")
    public List<Person> getPersonsByGroupId(@PathVariable Long id) {
        Group group = getGroupById(id);
        if (group != null) {
            return group.getPersons();
        }
        return null;
    }
}
