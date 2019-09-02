package com.mussi.tiago.ping;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/ccb_icmp_ping_test" }, 
		features = { "src/test/resources/com/mussi/tiago/ping/ICMP.feature" },
		glue = "com.mussi.tiago.ping")
public class ICMPPingTest {

	
}
