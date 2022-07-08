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
	
	@Quando("digitar para logar o emai {string}")
	public void digitarParaLogarOEmai(String string) {
		Na(LoginPage.class).emailLogar(string);
	}

	@Quando("informar uma senha para logoar {string}")
	public void informarUmaSenhaParaLogoar(String string) {
		Na(LoginPage.class).passwordLogar(string);;
	}
	
	@Quando("cliar em logar")
	public void cliarEmLogar() {
		Na(LoginPage.class).botaoLogar();
	}

	@Entao("o sistema exibe a mensagem de Invalid email address.")
	public void oSistemaExibeAMensagemDeInvalidEmailAddress() {
	   assertEquals("Invalid email address.", driver.findElement(By.xpath("//li[contains(.,'Invalid')]")).getText());
	}

	@Entao("abrira a pagina create account")
	public void abriraAPaginaCreateAccount() {
		assertEquals("CREATE AN ACCOUNT",driver.findElement(By.xpath("//h1[contains(.,'Create')]")).getText());
	}
	
	@Entao("o sistema informara que o usuario esta logado")
	public void oSistemaInformaraQueOUsuarioEstaLogado() {
		assertEquals("Alex Ferreira Canel",driver.findElement(By.xpath("//span[contains(.,\"Alex Ferreira Canel\")]")).getText());
	}
	
	
	

}
