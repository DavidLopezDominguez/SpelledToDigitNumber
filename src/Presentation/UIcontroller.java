package Presentation;

import java.util.Scanner;

public class UIcontroller {
    private Scanner sc;

    public UIcontroller() {
        sc = new Scanner(System.in);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String scanString() {
        return sc.nextLine();
    }
}
