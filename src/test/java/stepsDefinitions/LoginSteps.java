package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	@Quando("eu acionar a barra sign in")
	public void euAcionarABarraSignIn() {
	    Na(LoginPage.class).botaoLogin();
	}

	@Quando("e informar e um email no campo email address {string}")
	public void eInformarEUmEmailNoCampoEmailAddress(String email) {
		Na(LoginPage.class).informarCampoEmail(email);
	}

	@Quando("clicar no botao crate account")
	public void clicarNoBotaoCrateAccount() {
		Na(LoginPage.class).botaoCreateAccount();
	}

	@Entao("o sistema exibe a mensagem de Invalid email address.")
	public void oSistemaExibeAMensagemDeInvalidEmailAddress() {
	   assertEquals("Invalid email address.", driver.findElement(By.xpath("//li[contains(.,'Invalid')]")).getText());
	}

	@Entao("abrira a pagina create account")
	public void abriraAPaginaCreateAccount() {
		assertEquals("CREATE AN ACCOUNT",driver.findElement(By.xpath("//h1[contains(.,'Create')]")).getText());
	}

}
