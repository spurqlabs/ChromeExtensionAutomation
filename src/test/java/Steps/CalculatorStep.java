package Steps;

import Pages.CalculatorPage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class CalculatorStep extends TestContext {

    CalculatorPage calculatorPage;
    public CalculatorStep() throws AWTException { calculatorPage = new CalculatorPage(driver); }
    @Given("User clicks on the extension icon")
    public void User_clicks_on_the_extension_icon() throws InterruptedException {
        calculatorPage.User_clicks_on_the_extension_icon();
    }
    @And("User clicks on the calculator extension")
    public void userClicksOnTheCalculatorExtension() throws InterruptedException {
        calculatorPage.userClicksOnTheCalculatorExtension();
    }
    @When("User clicks on number {int}")
    public void User_clicks_on_number(int number) throws InterruptedException {
        calculatorPage.User_clicks_on_number(number);
    }

    @And("User clicks on {string} operator")
    public void userClicksOnOperator(String operator) throws InterruptedException {
        calculatorPage.userClicksOnOperator(operator);
    }

    @Then("User sees the result {int}")
    public void userSeesTheResult(int result) throws InterruptedException {
        calculatorPage.userSeesTheResult(result);
    }
}
