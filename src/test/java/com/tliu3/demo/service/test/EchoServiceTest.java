package com.tliu3.demo.service.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tliu3.demo.service.EchoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-config-test.xml")
public class EchoServiceTest {

	private final static Logger logger = LoggerFactory.getLogger(EchoServiceTest.class);

	@Autowired
	private EchoService echoService;

	@Test
	public void testEcho() {
		logger.debug("Start testing echo service...");
		assertEquals("Hello Test", this.echoService.echo("Test"));
		logger.debug("End testing echo service...");
	}
}
