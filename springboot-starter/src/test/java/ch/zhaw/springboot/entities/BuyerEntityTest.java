package ch.zhaw.springboot.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuyerEntityTest {
	@Test
	public void testGetterAndSetter (){
		Buyer entity = new Buyer();
		entity.setNumberOfBuys(3);

		assertEquals(3, entity.getNumberOfBuys());
	}
}
