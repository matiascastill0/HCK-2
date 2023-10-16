package com.example.demo;

import java.util.List;
import java.util.ArrayList;

public class GroupsController {
    private Groups groups;

    public GroupsController() {
        this.groups = new Groups();
    }

    public void addGroup(String groupName) {
        Group group = new Group(groupName);
        groups.addGroup(group);
    }

    public List<Group> getAllGroups() {
        return groups.getGroups();
    }

    public static void main(String[] args) {
        GroupsController controller = new GroupsController();
        controller.addGroup("Group A");
        List<Group> allGroups = controller.getAllGroups();
        for (Group group : allGroups) {
            System.out.println("Group Name: " + group.getGroupName());
        }
    }
}
