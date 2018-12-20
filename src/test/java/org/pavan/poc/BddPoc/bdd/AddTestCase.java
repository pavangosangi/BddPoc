package org.pavan.poc.BddPoc.bdd;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.pavan.poc.BddPoc.Steps.AdditionSteps;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import net.thucydides.core.annotations.Steps;

public class AddTestCase {

	@Steps
	AdditionSteps additionSteps;
	
	@Given("valid numbers 5 and 5")
	public void givenSomething() {
		additionSteps.setA(5);
		additionSteps.setB(5);
	}
	
	@Given("valid numbers 5 and 8")
	public void givenSomething_1() {
		additionSteps.setA(5);
		additionSteps.setB(8);
	}
	
	@When("i add those two numbers")
	public void whenSomething() {
		additionSteps.add();
	}
	
	@Then("actual answer should be equal to what is expected")
	public void thenSomething() {
		assertEquals("10", Integer.toString(additionSteps.getResult()));
	}
	
	@Then("actual answer should not be equal to what is expected")
	public void thenSomething_1() {
		assertNotEquals("10", Integer.toString(additionSteps.getResult()));
	}
}
