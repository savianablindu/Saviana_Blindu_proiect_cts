package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.ModalitatePlataCard;

public class TestEsteIntreg {

	@Test
	public void test() {
		ModalitatePlataCard modalitate2=new ModalitatePlataCard();
		
		assertTrue(modalitate2.esteIntreg(50));
		
	}
	
	@Test
	public void test2() {
		ModalitatePlataCard modalitate2=new ModalitatePlataCard();
		
		assertFalse(modalitate2.esteIntreg(20.5));
		
	}
	
	@Test
	public void test3() {
		ModalitatePlataCard modalitate2=new ModalitatePlataCard();
		
		assertTrue(modalitate2.esteIntreg(-2));
		
	}
	
	@Test
	public void test4() {
		ModalitatePlataCard modalitate2=new ModalitatePlataCard();
		
		assertTrue(modalitate2.esteIntreg(0));
		
	}

	@Test
	public void test5() {
		ModalitatePlataCard modalitate2=new ModalitatePlataCard();
		
		assertTrue(modalitate2.esteIntreg(50000));
		
	}
}
