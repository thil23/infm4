package ch.zhaw.springboot.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArtisanEntityTest {
	
	@Test
	public void testGetterAndSetter (){
		Artisan entity = new Artisan();
		entity.setArtisanProfession("testberuf");

		assertEquals("testberuf", entity.getArtisanProfession());
	}
}
