package Excepcions.ActivitatExceptions;

import java.util.Scanner;

public class MenuBank {
    private Scanner sc = new Scanner(System.in);

    public void showMain() {
        int op;
        do {
            System.out.println("1. Clients");
            System.out.println("2. Comptes");
            System.out.println("0. Sortir");
            op = sc.nextInt();
            switch (op) {
                case 1 -> menuClients();
                case 2 -> menuComptes();
            };
        }while(op!=0);

    }

    private void menuComptes() {
        System.out.println("Comptes");
    }

    private void menuClients() {
        System.out.println("Clients");
    }
}
