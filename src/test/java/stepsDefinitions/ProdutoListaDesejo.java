package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.SearchPage;

public class ProdutoListaDesejo {
	
	@Quando("o usuario clicar no produto")
	public void oUsuarioClicarNoProduto() {
	   Na(SearchPage.class).clicarProduto();
	}

	@Quando("clicar em adicionar o produto a lista de desejo")
	public void clicarEmAdicionarOProdutoAListaDeDesejo() {
		Na(SearchPage.class).prudutoListaDesejo();
	}

	@Entao("o sistema informara que o produto foi adicionado a lista de desejo")
	public void oSistemaInformaraQueOProdutoFoiAdicionadoAListaDeDesejo() {
		assertEquals("You must be logged in to manage your wishlist.",driver.findElement(By.xpath("//p[contains(@class,\"fancybox-error\")]")).getText());
	}


}
