package com.mussi.tiago.ping;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ICMPPingTestSteps {

	@Given("^hosts$")
	public void defineHosts(DataTable dt) {
		throw new PendingException();
	}

	@Given("^delay \"([^\"]*)\" seconds$")
	public void defineDelay(int delayInSecods) {
		throw new PendingException();
	}

	@Given("^ping command \"([^\"]*)\"$")
	public void definePingCommand(String pingCommand) {
		throw new PendingException();
	}

	@When("^ping hosts$")
	public void pingHosts() {
		throw new PendingException();
	}

	@Then("^should return ping ICMP result statistics \"([^\"]*)\"$")
	public void shouldReturnICMPResult(String icmpResult) {
		throw new PendingException();
	}

}
