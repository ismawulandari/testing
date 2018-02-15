package com.aprisma.devops.testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingApplicationTests {
	Customer customer;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCustomerName() {
		customer = new Customer();
		customer.setAddress("slipi");
		assertEquals("slipi", customer.getAddress());

	}

	public void testSum() {
		customer = new Customer();
		int result = customer.sum(5, 6);
		// Then
		if (result != 11) { // if 2 + 2 != 4
			Assert.fail();
		}
	}
}
