package Teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;







import org.junit.Assert;
import org.junit.Test;

import clase.Memento;
import clase.Review;
import clase.Review_salvat;

public class TestReview_Salvat {

	@Test
	public void test() {
		
		//ArrayList<String> x = new ArrayList(Arrays.asList("Mancare excelenta", "Atmosfera placuta", "Servire impecabila"));
		//String[] x = {"Mancare excelenta", "Atmosfera placuta", "Servire impecabila"};
		
		
		Review_salvat review_s=new Review_salvat();
		Review review1=new Review();
		review1.setMesaj("Mancare excelenta");
		review_s.adaugareMesaj(review1.savetoMemento());
		review1.setMesaj("Atmosfera placuta");
		review_s.adaugareMesaj(review1.savetoMemento());
		review1.setMesaj("Servire impecabila");
		review_s.adaugareMesaj(review1.savetoMemento());
		
		//Assert.assertEquals(x, review_s.getMesajeSalvate());
		
	}



	

}
