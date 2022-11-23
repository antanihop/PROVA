package net.rossonet.console.web;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan("net.bottegaio.console")
class RunWebInterfaceTests {

	// TODO: scrivere test per web console
	// @Test
	void contextLoads() throws InterruptedException {
		Thread.sleep(60000);
	}

}
