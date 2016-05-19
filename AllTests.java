package Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NumaraTest.class, TestAngajati.class, TestAperitiv.class,
		TestConstructor.class, TestEsteIntreg.class,
		TestModalitatePlataCard.class, TestOut.class, TestReview_Salvat.class,
		TestSetterGetter.class, TestTestOut.class })
public class AllTests {

}
