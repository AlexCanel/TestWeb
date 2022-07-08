package stepsDefinitions;

import static utils.Utils.*;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	
	@Before(value = "@cadastrausuario")
	public void funcionalidadeCadatrarUsuario() throws InterruptedException{
		acessarSistema();
		Thread.sleep(10);
		Na(LoginPage.class).testarEmail("joaogomes@email.com");
	}
	
	@Before	
	public void acessarSistema() throws InterruptedException{
	acessarSistema();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		driver.quit();
	}


}
