package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
		
		
	@FindBy(name = "email_create")
	public WebElement emailCasdrar;
	
	@FindBy(name = "SubmitCreate")
	public WebElement botaoCreateAccount;
	
	@FindBy(name = "email")
	public WebElement emailLogar;
	
	@FindBy(name = "passwd")
	public WebElement passwordLogar;
	
	@FindBy(name = "SubmitLogin")
	public WebElement botaoLogar;
	
	
	//BasePage
	public void botaoLogin() {
		botaoLogin.click();;
	}
	
	public void informarCampoEmail(String email) {
		emailCasdrar.sendKeys(email);
	}

	public void botaoCreateAccount() {	
		botaoCreateAccount.click();
	}
	
	public void emailLogar(String email) {
		emailLogar.sendKeys(email);
	}

	public void passwordLogar(String email) {	
		passwordLogar.sendKeys(email);
	}
	
	public void botaoLogar() {	
		botaoLogar.click();
	}
	
	
	
	public void testarEmail(String email) {	
		botaoLogin.click();
		emailCasdrar.sendKeys(email);
		botaoCreateAccount.click();
	}
	
	public void logarUsuario(String email, String senha) {
		botaoLogin.click();
		emailLogar.sendKeys(email);
		passwordLogar.sendKeys(senha);
		botaoLogar.click();
	}

}


