package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Desert;
import clase.Review;

public class TestOut {

	@Test 
	public void test() {
		
		Desert desert1=new Desert();
		 System.out.print("hello");
		    assertNotEquals("hello", desert1.toString());
	}
	
	
	@Test
	public void test2() {
		
		Desert desert1=new Desert();
		 System.out.print("Desert Savarina, pret=10.5");
		    assertEquals("Desert Savarina, pret=10.5", desert1.toString());
	}
	
	@Test
	public void test3() {
		
		Review review1=new Review("Meniu diversificat");
		 System.out.print("Review: Meniu diversificat");
		    assertEquals("Review: Meniu diversificat", review1.toString());
	}

	
	@Test
	public void test4() {
		
		Review review1=new Review("Servire rapida");
		 System.out.print("Review: Servire rapida");
		    assertEquals("Review: Servire rapida", review1.toString());
	}
	
	@Test
	public void test5() {
		
		Review review1=new Review("Servire rapidaaa");
		 System.out.print("Review: Servire rapida");
		    assertNotEquals("Review: Servire rapida", review1.toString());
	}
	
	@Test
	public void test6() {
		
		Review review1=new Review();
		 System.out.print("Review: Servire rapida");
		    assertNotEquals("Review: Servire rapida", review1.toString());
	}
}
