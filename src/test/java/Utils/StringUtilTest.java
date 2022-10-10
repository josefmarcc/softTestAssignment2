package Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    private StringUtil stringUtil;
    private String input;
    private String result;


    @Given("^user wants to reverse the input \"([^\"]*)\"$")
    public void user_wants_to_reverse_the_input(String arg1) throws Exception {
        stringUtil = new StringUtil();
    }

    @When("^user inputs \"([^\"]*)\"$")
    public void user_inputs(String arg1) throws Exception {
        input = "aBc";
    }

    @Then("^\"([^\"]*)\" is reversed to \"([^\"]*)\"$")
    public void is_reversed_to(String arg1, String arg2) throws Exception {
        result = stringUtil.reverseInput(input);
        assertEquals("cBa", result);
    }

    @Given("^user wants to capitalize the input \"([^\"]*)\"$")
    public void user_wants_to_capitalize_the_input(String arg1) throws Exception {
        stringUtil = new StringUtil();
    }

    @When("^user inputs the string \"([^\"]*)\"$")
    public void user_inputs_the_string(String arg1) throws Exception {
        input = "hAllo";
    }

    @Then("^\"([^\"]*)\" is capitalized to \"([^\"]*)\"$")
    public void is_capitalized_to(String arg1, String arg2) throws Exception {
        result = stringUtil.capitalizeInput(input);
        assertEquals("HALLO", result);
    }

    @Given("^user wants to lowercase the input \"([^\"]*)\"$")
    public void user_wants_to_lowercase_the_input(String arg1) throws Exception {
        stringUtil = new StringUtil();
    }

    @When("^user inputs string \"([^\"]*)\"$")
    public void user_inputs_string(String arg1) throws Exception {
        input = "hEy";
    }

    @Then("^\"([^\"]*)\" is lowercased to \"([^\"]*)\"$")
    public void is_lowercased_to(String arg1, String arg2) throws Exception {
        result = stringUtil.lowercaseInput(input);
        assertEquals("hey", result);
    }

}
