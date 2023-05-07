package creational.abstractFactory.example.factories;

import creational.abstractFactory.example.buttons.Button;
import creational.abstractFactory.example.buttons.WindowsButton;
import creational.abstractFactory.example.checkboxes.Checkbox;
import creational.abstractFactory.example.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}