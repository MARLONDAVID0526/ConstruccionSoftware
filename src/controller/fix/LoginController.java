package controller.fix;

import java.util.regex.Pattern;

public class LoginController {

    public boolean login(String username, String password) {
        if(!dataValidator(username, password)) {
            System.out.println("Invalid username or password");
            return false;
        }
        InMemoryUsers inMemoryUsers = InMemoryUsers.getInstance();
        return inMemoryUsers.getUsers().containsKey(username)
                && inMemoryUsers.getUsers().get(username).equals(password);
    }

    public boolean dataValidator(String username, String password) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]*$");
        if(username == null || password == null)
            return false;
        else return pattern.matcher(username).matches() && pattern.matcher(password).matches();
    }

}
