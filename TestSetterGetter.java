package Teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import clase.Desert;

public class TestSetterGetter {

	@Test
	public void testSetGet() {
		int a=20;
		 Desert desert1=new Desert();
		desert1.setPret(20);
		int value=(int) desert1.getPret();
		Assert.assertTrue("Eroare", value==a);
		
	}
	
	
	@Test
	public void testSetGet2() {
		int a=0;
		 Desert desert1=new Desert();
		desert1.setPret(0);
		int value=(int) desert1.getPret();
		Assert.assertTrue("Eroare", value==a);
		
	}
	
	@Test
	public void testSetGet3() {
		int a=10;
		 Desert desert1=new Desert();
		desert1.setPret(0);
		int value=(int) desert1.getPret();
		Assert.assertFalse("Eroare", value==a);
		
	}
	
	@Test
	public void testSetGet4() {
		int a=10;
		 Desert desert1=new Desert();
		desert1.setPret(20);
		int value=(int) desert1.getPret();
		Assert.assertFalse("Eroare", value==a);
		
	}

}


