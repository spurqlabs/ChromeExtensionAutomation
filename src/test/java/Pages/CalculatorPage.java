package Pages;

import Utilities.TestContext;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Objects;

public class CalculatorPage extends TestContext {
    public CalculatorPage(WebDriver driver) throws AWTException {
        TestContext.driver = driver;
//        PageFactory.initElements(driver, this);
    }
    public Robot robot = new Robot();

    public void User_clicks_on_the_extension_icon() throws InterruptedException {
        Thread.sleep(5000);
        robot.mouseMove(1250, 48);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void userClicksOnTheCalculatorExtension() throws InterruptedException {
        Thread.sleep(3000);
        robot.mouseMove(1000, 190);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
    }

    public void User_clicks_on_number(int number) throws InterruptedException {
//        Thread.sleep(3000);
        if(number == 0){robot.mouseMove(964, 450);}
        else if (number == 1) {robot.mouseMove(969, 390);}
        else if (number == 2) {robot.mouseMove(1020, 391);}
        else if (number == 3) {robot.mouseMove(1087, 395);}
        else if (number == 4) {robot.mouseMove(964, 334);}
        else if (number == 5) {robot.mouseMove(1023, 336);}
        else if (number == 6) {robot.mouseMove(1080, 334);}
        else if (number == 7) {robot.mouseMove(965, 282);}
        else if (number == 8) {robot.mouseMove(1023, 278);}
        else if (number == 9) {robot.mouseMove(1089, 278);}
        else { System.out.println("Number Invalid"); }
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
    }

    public void userClicksOnOperator(String operator) throws InterruptedException {
//        Thread.sleep(3000);
        if(Objects.equals(operator, "+")){robot.mouseMove(1139, 446);}
        else if (Objects.equals(operator, "-")) {robot.mouseMove(1137, 386);}
        else if (Objects.equals(operator, "*")) {robot.mouseMove(1137, 331);}
        else if (Objects.equals(operator, "/")) {robot.mouseMove(1138, 272);}
        else if (Objects.equals(operator, "=")) {robot.mouseMove(1199, 446);}
        else {System.out.println("Invalid Operator");}
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
    }

    public void userSeesTheResult(int result) {
        System.out.println("Result should be "+ result);
    }
}
