package Presentation;

import Business.ParserManager;

public class Controller {
    private UIcontroller uicontroller;
    private ParserManager parserManager;

    public Controller() {
        uicontroller = new UIcontroller();
        parserManager = new ParserManager();
    }

    /**
     * That function runs the project.
     */
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
