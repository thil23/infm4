package ch.zhaw.springboot.entities;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

import org.junit.Test;

public class EngagementEntityTest {
	@SuppressWarnings("deprecation")
	@Test
	public void testGetterAndSetter (){
		Engagement entity = new Engagement();
		entity.setArtisan(new Artisan("testberuf"));
		entity.setBuyer(new Buyer(3));
		entity.setDuration(4);
		entity.setPrice(4.5);
		Set<Piece> test = new HashSet<Piece>();
		test.add(new Piece(123, "testpiece"));
		entity.setPieces(test);
		
		assertEquals("testberuf", entity.getArtisan().getArtisanProfession());
		assertEquals(3, entity.getBuyer().getNumberOfBuys());
		assertEquals(4, entity.getDuration());
		assertEquals(4.5, entity.getPrice(),0);
		assertFalse(entity.getPieces().isEmpty());
	}
}
