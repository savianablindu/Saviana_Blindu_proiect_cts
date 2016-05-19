package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Angajati;

public class TestAngajati {

	@Test
	public void test() {
		Angajati ang1=new Angajati("Vasile", "Ion",1986,251.2);
		int varsta=30;
		assertEquals(varsta, ang1.getVarsta(ang1.getAn_nastere()));
	}
	
	@Test
	public void test2() {
		Angajati ang1=new Angajati("Vasile", "Ion",1986,251.2);
		int varsta=26;
		assertNotEquals(varsta, ang1.getVarsta(ang1.getAn_nastere()));
	}

	
	@Test
	public void test3() {
		Angajati ang1=new Angajati("Vasile", "Ion",2016,251.2);
		int varsta=0;
		assertEquals(varsta, ang1.getVarsta(ang1.getAn_nastere()));
	}
	
	@Test
	public void test4() {
		Angajati ang1=new Angajati("Vasile", "Ion",1945,251.2);
		int varsta=0;
		assertNotEquals(varsta, ang1.getVarsta(ang1.getAn_nastere()));
	}
	
	
	@Test
	public void test5() {
		Angajati ang1=new Angajati("Vasile", "Ion",1945,251.2);
		double castig=17835.2;
		assertEquals(castig, ang1.CastigTotal(251.2,1945),0.1);
	}
	
	
	@Test
	public void test6() {
		Angajati ang1=new Angajati("Vasile", "Ion",1986,251.2);
		double castig=17835.2;
		assertNotEquals(castig, ang1.CastigTotal(251.2,1986),0.1);
	}
	
	@Test
	public void test7() {
		Angajati ang1=new Angajati("Vasile", "Ion",1986,251.2);
		double castig=17835.2;
		assertFalse(castig== ang1.CastigTotal(251.2,1986));
	}
	
	@Test
	public void test8() {
		Angajati ang1=new Angajati("Vasile", "Ion",1945,251.2);
		double castig=17835.2;
		assertTrue(castig== ang1.CastigTotal(251.2,1945));
	}
}
