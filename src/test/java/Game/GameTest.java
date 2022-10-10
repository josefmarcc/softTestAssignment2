package Game;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    private Game game;
    private int input;
    private int result;

    @Given("^user inputs the number of pins knocked down$")
    public void user_inputs_the_number_of_pins_knocked_down() throws Exception {
        game = new Game();
    }

    @When("^user inputs the number (\\d+)$")
    public void user_inputs_the_number(int arg1) throws Exception {
        game.roll(2);
    }

    @Then("^score should be updated by (\\d+)$")
    public void score_should_be_updated_by(int arg1) throws Exception {
        result = game.getScore();
        assertEquals(2, result);
    }

    @Given("^the current score is (\\d+)$")
    public void the_current_score_is(int arg1) throws Exception {
        game = new Game();
        game.roll(23);
    }

    @When("^user calls the function score\\(\\)$")
    public void user_calls_the_function_score() throws Exception {
        result = game.getScore();
    }

    @Then("^function score\\(\\) should return (\\d+)$")
    public void function_score_should_return(int arg1) throws Exception {
        assertEquals(23, result);
    }

    @Given("^a user rolls a spare$")
    public void a_user_rolls_a_spare() throws Exception {
        game = new Game();
    }

    @When("^user rolls (\\d+) twice and the third fame is (\\d+)$")
    public void user_rolls_twice_and_the_third_fame_is(int arg1, int arg2) throws Exception {
        game.roll(5);
        game.roll(5);
        game.roll(3);
    }

    @Then("^score should be (\\d+)$")
    public void score_should_be(int arg1) throws Exception {
        result = game.getScore();
        assertEquals(16, result);
    }

    @Given("^a user rolls a strike$")
    public void a_user_rolls_a_strike() throws Exception {
        game = new Game();
    }

    @When("^user rolls a (\\d+), (\\d+) and (\\d+)$")
    public void user_rolls_a_and(int arg1, int arg2, int arg3) throws Exception {
        game.roll(10);
        game.roll(3);
        game.roll(4);
    }

    @Then("^getScore\\(\\) should return (\\d+)$")
    public void getscore_should_return(int arg1) throws Exception {
        result = game.getScore();
        assertEquals(24, result);
    }


}
