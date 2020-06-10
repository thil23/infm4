package ch.zhaw.springboot.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonEntityTest {
	
	@Test
	public void testGetterAndSetter (){
		Person entity = new Person();
		entity.seteMailaddress("testmail");
		entity.setId(1);
		entity.setName("testname");

		assertEquals("testmail", entity.geteMailaddress());
		assertEquals(1, entity.getId());
		assertEquals("testname", entity.getName());
	}
}
