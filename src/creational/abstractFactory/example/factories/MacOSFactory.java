package creational.abstractFactory.example.factories;

import creational.abstractFactory.example.buttons.Button;
import creational.abstractFactory.example.buttons.MacOSButton;
import creational.abstractFactory.example.checkboxes.Checkbox;
import creational.abstractFactory.example.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
