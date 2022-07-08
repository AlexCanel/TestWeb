package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.OrderPage;

public class CarrinhoComprasSteps {
	
	@Quando("o usuario clicar no icone da lixeira")
	public void oUsuarioClicarNoIconeDaLixeira() throws InterruptedException {
			Na(OrderPage.class).clicarLixeira();
	}

	@Entao("o Sistema informara que o carrinho esta vazio")
	public void oSistemaInformaraQueOCarrinhoEstaVazio() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals("(empty)",driver.findElement(By.xpath("//span[contains(@class, 'ajax_cart_no_product')]")).getText());
	}
	
	
	@Entao("o carrinho ira esta com dois produtos")
	public void oCarrinhoIraEstaComDoisProdutos() throws InterruptedException {
		assertEquals("2",driver.findElement(By.xpath("//span[contains(@class, 'ajax_cart_quantity')]")).getText());
	}
		
}



