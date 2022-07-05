package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.OrderPage;

public class CarrinhoComprasSteps {
	
	@Quando("o usuario clicar no carrinho")
	public void oUsuarioClicarNoCarrinho() throws Exception {
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			Thread.sleep(10);
			Na(BasePage.class).cart();
	}
	



	@Quando("o usuario clicar no icone da lixeira")
	public void oUsuarioClicarNoIconeDaLixeira() {
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			Na(OrderPage.class).clicarLixeira();
	}
	
	

	
	
	
}



