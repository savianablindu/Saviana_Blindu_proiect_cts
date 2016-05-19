package Teste;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import clase.Desert;
import clase.Review;

public class SetUpTearDown {

	
	@Before
	public void setUp() throws FileNotFoundException {
		 Review r1 = new Review();
		 
	}
	
	@Test
	public void test() {
		Review review1=new Review("Meniu diversificat");
		 System.out.print("Review: Meniu diversificat");
		    assertEquals("Review: Meniu diversificat", review1.toString());
	}
	
	@Test
	public void test3(){
		int a=10;
		 Desert desert1=new Desert();
		desert1.setPret(0);
		int value=(int) desert1.getPret();
		Assert.assertFalse("Eroare", value==a);
		}	
	
	@Test
	public void test2() throws IOException {
		Desert desert1=new Desert();
		 System.out.print("Desert Savarina, pret=10.5");
		    assertEquals("Desert Savarina, pret=10.5", desert1.toString());
	}	

	@Test
	public void test4() throws NumberFormatException, IOException {
		Review review1=new Review("Meniu diversificat");
		 System.out.print("Review: Meniu diversificat");
		    assertEquals("Review: Meniu diversificat", review1.toString());
	}
	
	
	@After
	public void tearDown() throws IOException{
		
	}
}
