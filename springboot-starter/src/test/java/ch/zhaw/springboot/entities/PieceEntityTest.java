package ch.zhaw.springboot.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PieceEntityTest {
	@Test
	public void testGetterAndSetter (){
		Piece entity = new Piece(1,"testpiece");

		assertEquals("testpiece", entity.getPieceName());
		assertEquals(1, entity.getId());
	}
}
