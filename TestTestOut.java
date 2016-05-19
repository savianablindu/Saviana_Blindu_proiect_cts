package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Desert;

public class TestTestOut {

	@Test (timeout=10000)
	
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
	}


