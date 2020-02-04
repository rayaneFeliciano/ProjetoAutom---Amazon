package br.com.AutomacaoPO.suiteTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.AutomacaoPO.tests.CarrinhoTest;
import br.com.AutomacaoPO.tests.CepTest;
import br.com.AutomacaoPO.tests.FreteGratisTest;
import br.com.AutomacaoPO.tests.PesquisaTest;

@RunWith(Suite.class)
@SuiteClasses({CepTest.class,PesquisaTest.class,FreteGratisTest.class,CarrinhoTest.class})
public class AllTests {

}



