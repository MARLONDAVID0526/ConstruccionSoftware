package controller.fix;

import java.util.Scanner;

public class LoginUI {

    private LoginController loginController;

    public LoginUI() {
        loginController = new LoginController();
    }

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
        while(!loginController.login(username, password));
        while(!exit.equals("q")) {
            mainPage();
            exit = scanner.nextLine();
        }
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
