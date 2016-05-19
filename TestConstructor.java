package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Review;

public class TestConstructor {

	@Test
	public void test() {
		final String msg="Preturi foarte mici";
		Review review1=new Review("Preturi foarte mici");
		
		String rezultat=review1.getMesaj();
		
		assertEquals(msg, rezultat);
	}
	
	@Test
	public void test2() {
		final String msg="";
		Review review1=new Review("Preturi foarte mici");
		
		String rezultat=review1.getMesaj();
		
		assertNotEquals(msg, rezultat);
	}
	
	@Test
	public void test3() {
		final String msg="";
		Review review1=new Review();
		
		String rezultat=review1.getMesaj();
		
		assertNotEquals(msg, rezultat);
	}
	
	@Test
	public void test4() {
		final String msg="Preturi acceptabile";
		Review review1=new Review("Preturi acceptabile");
		
		String rezultat=review1.getMesaj();
		
		assertEquals(msg, rezultat);
	}


}
