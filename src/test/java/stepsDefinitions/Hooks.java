package stepsDefinitions;

import static utils.Utils.Na;
import static utils.Utils.acessarSistema;
import static utils.Utils.capturarTela;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;
import pageObjects.SearchPage;

public class Hooks {
	
	@Before	(value = "@testeEmail")
	public void funcionalidadeTestarEmail() throws InterruptedException{
		acessarSistema();
		Thread.sleep(10);
	}
	
	@Before(value = "@cadastrausuario")
	public void funcionalidadeCadatrarUsuario() throws InterruptedException{
		acessarSistema();
		Thread.sleep(10);
		Na(LoginPage.class).testarEmail("joaogomes@email.com");
	}
	
	
	@Before	(value = "@buscarprodutos")
	public void funcionalidadeBuscarProdutos() throws InterruptedException{
		acessarSistema();
		Thread.sleep(10);
	}
	
	@Before	(value = "@carrinhocompras")
	public void funcionalidadeCarrinhoCompras() throws Exception{
		acessarSistema();
		Na(SearchPage.class).buscarProdutos("Short");
		Na(SearchPage.class).buscarProdutos("Short");
	}
	
	@Before	(value = "@comprarProdutos")
	public void funcionalidadeComprarProdutos() throws Exception{
		acessarSistema();
		Na(LoginPage.class).logarUsuario("joaogomes@email.com", "123456");
		Na(SearchPage.class).buscarProdutos("Short");
	}
	
	
	
	
	@After
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		//driver.quit();
	}


}
