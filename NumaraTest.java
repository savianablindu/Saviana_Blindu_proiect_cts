package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Review;

public class NumaraTest {

	@Test
	public void test() {
		Review review=new Review();
		int output=review.numaraA("Mancarea a fost excelenta");
		assertEquals(5,output);
	}
	
	@Test
	public void test2(){
		Review review1=new Review();
		int output=review1.numaraA("Atmosfera foarte placuta");
		assertNotEquals(10,output);
	}

	@Test
	public void test3(){
		Review review2=new Review();
		int output=review2.numaraA("Atmosfera foarte placuta");
		assertEquals(5,output);
	}
	
	@Test
	public void test4(){
		Review review2=new Review();
		int output=review2.numaraA("");
		assertEquals(0,output);
	}
	
	@Test
	public void test5(){
		Review review2=new Review();
		int output=review2.numaraA("");
		assertTrue(0==output);
	}
	
	@Test
	public void test6(){
		Review review2=new Review();
		int output=review2.numaraA("Preturi mari");
		assertFalse(0==output);
	}
}
