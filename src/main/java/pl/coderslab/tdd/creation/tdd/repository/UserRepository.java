package pl.coderslab.tdd.creation.tdd.repository;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<Integer, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public void add(User user) {
        users.put(user.getId(), user);
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void update(User userNew) {
        users.put(userNew.getId(), userNew);
    }

    public void remove(int index) throws UserNotExistsException{
        if (!users.containsKey(index)){
            throw new UserNotExistsException();
        }
        users.remove(index);
    }
}