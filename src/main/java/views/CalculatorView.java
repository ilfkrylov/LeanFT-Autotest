package views;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.stdwin.*;
import org.testng.Assert;

/** Page analogue from PageObject for UI-testing */
public class CalculatorView {

    public Window getWindow() {
        try {
            return Desktop.describe(Window.class,
                    new WindowDescription.Builder()
                            .windowClassRegExp("CalcFrame")
                            .windowTitleRegExp("Калькулятор")
                            .build()
            );
        } catch (GeneralLeanFtException e) {
            throw new AssertionError("Window not found: " + e.getMessage(), e);
        }
    }

    public CalculatorView clickOnButton1() {
        try {
            getWindow().describe(Button.class,
                    new ButtonDescription.Builder()
                            .nativeClass("Button")
                            .windowId(131)
                            .build()
            ).click();
        } catch (GeneralLeanFtException e) {
            throw new AssertionError("Button not found: " + e.getMessage(), e);
        }
        return this;
    }

    public CalculatorView clickOnPlusButton() {
        try {
            // Method "describe" can find only one object
            getWindow().describe(Button.class,
                    new ButtonDescription.Builder()
                            .nativeClass("Button")
                            .windowId(93)
                            .build()
            ).click();
        } catch (GeneralLeanFtException e) {
            throw new AssertionError("Button not found: " + e.getMessage(), e);
        }
        return this;
    }

    public CalculatorView clickOnButton2() {
        try {
            getWindow().describe(Button.class,
                    new ButtonDescription.Builder()
                            .nativeClass("Button")
                            .windowId(132)
                            .build()
            ).click();
        } catch (GeneralLeanFtException e) {
            throw new AssertionError("Button not found: " + e.getMessage(), e);
        }
        return this;
    }

    public CalculatorView clickOnFirstEqualButton() {
        try {
            // Method "findChildren" can find several objects
            Button[] buttons = getWindow().findChildren(Button.class,
                    new ButtonDescription.Builder()
                            .nativeClass("Button")
                            .windowId(121)
                            .build());
            Assert.assertTrue(buttons.length > 0, "Buttons not found.");
            buttons[0].click();
        } catch (GeneralLeanFtException | CloneNotSupportedException e) {
            throw new AssertionError("Button not found: " + e.getMessage(), e);
        }
        return this;
    }

    public String getResultText() {
        try {
            return getWindow().describe(Static.class,
                    new StaticDescription.Builder()
                            .nativeClass("Static")
                            .windowId(150)
                            .build()
            ).getText();
        } catch (GeneralLeanFtException e) {
            throw new AssertionError("Button not found: " + e.getMessage(), e);
        }
    }
}
