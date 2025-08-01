package Presentation;

import java.util.Scanner;

public class UIcontroller {
    private Scanner sc;

    public UIcontroller() {
        sc = new Scanner(System.in);
    }

    /**
     * This function shows the message received in parameters.
     * @param message: the message to show.
     */
    public void showMessage(String message) {
        System.out.println(message);
    }

    /**
     * This function scans a line.
     * @return the scanned string.
     */
    public String scanString() {
        return sc.nextLine();
    }
}
