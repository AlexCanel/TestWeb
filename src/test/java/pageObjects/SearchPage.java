package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
	
	@FindBy(xpath= "//img[contains(@title, \"Faded\")]")
	public WebElement clicarProduto;
	
	@FindBy(xpath= "//button[contains(.,'Add to cart')]")
	public WebElement clicarAdicionarCarrinho;
	
	@FindBy(xpath= "//a[contains(@class,\"btn btn-default button button-medium\")]")
	public WebElement procedToCheckout;
	
	@FindBy(xpath = "//a[contains(@id,\"wishlist_button\")]")
	public WebElement prudutoListaDesejo;

	
	public void clicarProduto(){
		clicarProduto.click();
	}
	
	public void clicarAdicionarCarrinho() {
		clicarAdicionarCarrinho.click();
	}
	
	public void clicarProcedToCheckout() {
		procedToCheckout.click();
	}
	
	public void prudutoListaDesejo() {
		prudutoListaDesejo.click();
	}
	
	public void buscarProdutos(String produto) throws Exception{
		buscaProdutos.sendKeys("Short");
		submitSearch.click();
		clicarProduto.click();
		clicarAdicionarCarrinho.click();
		procedToCheckout.click();
	}
}
