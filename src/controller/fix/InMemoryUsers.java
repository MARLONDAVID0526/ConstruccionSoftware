package controller.fix;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUsers {

    private static InMemoryUsers instance;

    private final Map<String, String> users;

    private InMemoryUsers() {
        users = new HashMap<>();
        users.put("admin", "admin");
        users.put("user1", "user1");
        users.put("user3", "user3");
    }

    public static InMemoryUsers getInstance() {
        if(instance == null) {
            instance = new InMemoryUsers();
        }
        return instance;
    }

    public Map<String, String> getUsers() {
        return users;
    }
}
