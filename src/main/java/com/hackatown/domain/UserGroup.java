package com.hackatown.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserGroup {

    private List<User> users;
    private UUID groupId;
    private String description;

    public UserGroup(){
        this.users = new ArrayList<>();
        this.groupId = UUID.randomUUID();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(String userId){
        this.users.removeIf(user -> user.getId() == userId);
    }

}
