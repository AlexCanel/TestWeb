package pageObjects;

import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
	
	@FindBy(xpath= "//img[contains(@title, \"Faded\")]")
	public WebElement clicarProduto;
	
	@FindBy(xpath= "//button[contains(.,'Add to cart')]")
	public WebElement clicarAdicionarCarrinho;
	
	@FindBy(xpath= "//a[contains(@class,\"btn btn-default button button-medium\")]")
	public WebElement procedToCheckout;

	
	public void clicarProduto(){
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		clicarProduto.click();
	}
	
	public void clicarAdicionarCarrinho() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		clicarAdicionarCarrinho.click();
	}
	
	public void procedToCheckout() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		procedToCheckout.click();
	}
	
	
	public void buscarProdutos(String produto) throws Exception{
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		buscaProdutos.sendKeys(produto);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		submitSearch.click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		clicarProduto.click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		clicarAdicionarCarrinho.click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		procedToCheckout.click();
	}
}
