package creational.abstractFactory.example.app;

import creational.abstractFactory.example.buttons.Button;
import creational.abstractFactory.example.checkboxes.Checkbox;
import creational.abstractFactory.example.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}