package Teste;



import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import clase.ModalitatePlataCard;

public class TestModalitatePlataCard {

	
	@Test
	public void test() {
		ModalitatePlataCard modalitate1=new ModalitatePlataCard();
		double a =45;
		double b=modalitate1.reducere(50);
		assertEquals(a, modalitate1.reducere(50),0.1);
	}
	


}
