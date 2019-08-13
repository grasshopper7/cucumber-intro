package intro;

import cucumber.api.java.en.*;

public class OrderStepDefs {

	@Given("Customer receives the menu")
	public void customer_receives_the_menu() {
		System.out.println("GIVEN - Customer receives the menu");
	}

	@When("Orders one Margherita pizza")
	public void orders_one_Margherita_pizza() {
		System.out.println("WHEN - Orders one Margherita pizza");
	}

	@Then("Kitchen should receive the order")
	public void kitchen_should_receive_the_order() {
		System.out.println("THEN - Kitchen should receive the order");
	}
}
