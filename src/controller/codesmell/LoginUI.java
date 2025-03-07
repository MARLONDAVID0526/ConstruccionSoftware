package controller.codesmell;

import java.util.Scanner;

public class LoginUI {
    public void render() {
        String username;
        String password;
        String exit = "";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Ingrese su usuario");
            username = scanner.nextLine();
            System.out.println("Ingrese su contraseña");
            password = scanner.nextLine();
        }
        while(!login(username, password));
        while(!exit.equals("q")) {
            mainPage();
            exit = scanner.nextLine();
        }
    }

    public boolean login(String username, String password) {
        InMemoryUsers inMemoryUsers = InMemoryUsers.getInstance();
        return inMemoryUsers.getUsers().containsKey(username)
                && inMemoryUsers.getUsers().get(username).equals(password);
    }

    public void mainPage() {
        System.out.println("--------------------------");
        System.out.println("|                                    |");
        System.out.println("|                                    |");
        System.out.println("|      Ingreso exitoso     |");
        System.out.println("|                                    |");
        System.out.println("|                                    |");
        System.out.println("--------------------------");
    }
}
