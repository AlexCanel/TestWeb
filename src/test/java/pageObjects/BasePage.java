package pageObjects;

import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
	@FindBy(className = "login")
	public WebElement botaoLogin;
	
	@FindBy(className= "search_query")
	public WebElement buscaProdutos;
	
	@FindBy(name = "submit_search")
	public WebElement submitSearch;
	
	@FindBy(xpath = "//a[contains(@title,\"View my shopping cart\")]")
	public WebElement cart;
	

	
	//Escrever qual produto quer produtos
	public void campobusca(String produtos) {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		buscaProdutos.sendKeys(produtos);
	}
	
	//Buscar produtos
	public void submitSearch() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		submitSearch.click();
	}
	
	//Escrever e Buscar o produto
	public void buscarProdutos(String produtos) throws Exception{
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		buscaProdutos.sendKeys(produtos);
		submitSearch.click();
	}
	
	//Entrar no Carrinho
	public void cart() throws Exception {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		cart.click();
	}
	

	
	
	
	
	


}
