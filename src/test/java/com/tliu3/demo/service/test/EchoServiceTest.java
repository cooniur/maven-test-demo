package com.tliu3.demo.service.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tliu3.demo.service.EchoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-config-test.xml")
public class EchoServiceTest {

	@Autowired
	private EchoService echoService;

	@Test
	public void testEcho() {
		assertEquals("Hello Test", this.echoService.echo("Test"));
	}
}
