package pageObjects;

import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {
	
	@FindBy(className = "icon-trash")
	public WebElement clicarLixeira;
	
	@FindBy(xpath = "//a[contains(@class,\"button btn btn-default standard-checkout button-medium\")]")
	public WebElement proceedToCheckoutSummary;
	
	@FindBy(name= "processAddress")
	public WebElement proceedToCheckoutAddress;
	
	@FindBy(name = "processCarrier")
	public WebElement proceedToCheckoutCarrier;
	
	@FindBy(id = "uniform-cgv")
	public WebElement selecionarTermosServicos;
	
	@FindBy(xpath = "//a[contains(@class,\"cheque\")]")
	public WebElement formaPagamento;
	
	@FindBy(xpath = "//button[contains(@class,\"button btn btn-default button-medium\")]")
	public WebElement confirmarOrdem;
	
	
	public void clicarLixeira() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		clicarLixeira.click();
	}
	
	public void proceedToCheckout() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		proceedToCheckoutSummary.click();
	}
	
	public void proceedToCheckoutAddress() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		proceedToCheckoutAddress.click();
	}
	
	public void proceedToCheckoutCarrier() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		proceedToCheckoutCarrier.click();
	}

	public void selecionarTermosServicos() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		selecionarTermosServicos.click();
	}
	
	public void formaPagamento() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		formaPagamento.click();
	}

	public void confirmarOrdem() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		confirmarOrdem.click();
	}

	
	public void realizarCompra() {
		proceedToCheckoutSummary.click();
		proceedToCheckoutAddress.click();
		selecionarTermosServicos.click();
		proceedToCheckoutCarrier.click();
	}

}
