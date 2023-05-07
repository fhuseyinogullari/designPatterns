package creational.abstractFactory.example.factories;

import creational.abstractFactory.example.buttons.Button;
import creational.abstractFactory.example.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}