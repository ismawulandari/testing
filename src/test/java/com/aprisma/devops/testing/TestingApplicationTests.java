package com.aprisma.devops.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCustomerName(){
		Customer customer = new Customer();
		customer.setAddress("slipi");
		assertEquals("slipi", customer.getAddress());

	}
}
