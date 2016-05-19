package Teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import clase.Aperitiv;

public class TestAperitiv {

	@Test
	public void test() {
		Aperitiv aperitiv1=new Aperitiv("Platou branzeturi", 20.5);
		double a=25.3;
		try{
		aperitiv1.setPret(-20.3);
		Assert.fail("valoare ok");
		}
		catch(IllegalArgumentException e){
			
		}
	}
	
	@Test
	public void test2() {
		Aperitiv aperitiv1=new Aperitiv();
		int a=25;
		aperitiv1.setPret(25);
		int valoare=(int) aperitiv1.getPret();
		Assert.assertEquals(a, valoare);
		
	}
	
	@Test
	public void test3() {
		Aperitiv aperitiv1=new Aperitiv();
		double a=21.6;
		aperitiv1.setPret(21.6);
		double valoare=(double) aperitiv1.getPret();
		Assert.assertEquals(a, valoare,0.1);
		
	}
	
	@Test
	public void test4() {
		Aperitiv aperitiv1=new Aperitiv();
		double a=20.3;
		aperitiv1.setPret(20.3);
		double valoare=(double) aperitiv1.getPret();
		Assert.assertEquals(a, valoare,0.1);
		
	}
	
	@Test
	public void test5() {
		Aperitiv aperitiv1=new Aperitiv();
		double a=0;
		try{
			aperitiv1.setPret(0);
			Assert.fail("valoare ok");
			}
			catch(IllegalArgumentException e){
				
			}
		
	}
}
