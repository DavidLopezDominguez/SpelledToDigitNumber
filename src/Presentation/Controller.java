package Presentation;

import Business.ParserManager;

/**
 * Este proyecto va a recibir un string en ingles representando un número en lenguaje natural
 * y tenemos que retornar el mismo número pero en dígitos.
 */
public class Controller {
    private UIcontroller uicontroller;
    private ParserManager parserManager;

    public Controller() {
        uicontroller = new UIcontroller();
        parserManager = new ParserManager();
    }

    public void run() {
        uicontroller.showMessage("Insert a spelled number: ");
        String numberString = uicontroller.scanString();
        try {
            long number = parserManager.calculateNumber(numberString);
            uicontroller.showMessage("The number is: " + number);
        } catch (NumberFormatException e) {
            uicontroller.showMessage("Number format exception");
        } catch (IndexOutOfBoundsException e) {
            uicontroller.showMessage("Index out of bounds");
        } catch (IllegalArgumentException e) {
            uicontroller.showMessage("Invalid input");
        }
    }
}
