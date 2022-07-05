package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;

public class BuscaProdutosSteps {
	
	//BasePage
	@Quando("quando o usuario digitar na barra de buscas {string}")
	public void quandoOUsuarioDigitarNaBarraDeBuscas(String busca) {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    Na(BasePage.class).campobusca(busca);
	}
	
	//BasePage
	@Quando("clicar em buscar")
	public void clicarEmBuscar() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		Na(BasePage.class).submitSearch();
	}
	
	@Entao("o sistema ira mostra o resultado da busca")
	public void oSistemaIraMostraOResultadoDaBusca() {
		assertTrue(driver.findElement(By.xpath("//div[contains(@class,\"product-count\")]")).isDisplayed());
	}

	@Entao("o sistema mostra que nao foram encontrado resultados")
	public void oSistemaMostraQueNaoForamEncontradoResultados() {
		assertTrue(driver.findElement(By.xpath("//p[contains(@class,\"alert\")]")).isDisplayed());
	}

}
