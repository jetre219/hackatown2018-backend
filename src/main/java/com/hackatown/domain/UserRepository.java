package com.hackatown.domain;

public interface UserRepository {

    public boolean isUserExist(String userId);

    public User getUser(String userId);

    public void saveUser(User user);
}
