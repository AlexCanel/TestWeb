package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;



public class CadastrarUsuarioSteps {
	

@Quando("informar o primeiro mome no campo first name {string}")
public void eInformarOPrimeiroMomeNoCampoFirstName(String firstName) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarFirstName(firstName);
}

@Quando("informar  sobrenome no campo last name {string}")
public void eInformarSobrenomeNoCampoLastName(String lastName) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarLastname(lastName);
}

@Quando("informar uma senha no campo password {string}")
public void eInformarUmaSenhaNoCampoPassword(String password) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarPassword(password);
}

@Quando("informar e um endereco no campo adress {string}")
public void eInformarEUmEnderecoNoCampoAdress(String adress1) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarAdress1(adress1);
}

@Quando("informar uma cidade {string}")        ///////////////////
public void informarUmaCidade(String city) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarCity(city);
}

@Quando("informar e um estado no campo State {string}")         
public void eInformarEUmEstadoNoCampoState(String state) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarState(state);
}

@Quando("informar e um endereco postal no campo zipostal {string}")
public void informarEUmEnderecoPostalNoCampoZipPostal(String zipPostal) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarZipPostal(zipPostal);
}

@Quando("informar e um pais no campo country {string}")
public void eInformarEUmPaisNoCampoCountry(String country) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarCountry(country);
}

@Quando("digitar um numero de telefone no campo Mobile phone {string}")
public void digitarUmNumeroDeTelefoneNoCampoMobilePhone(String mobilePhone) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).adicionarMobilePhone(mobilePhone);
}

@Quando("clicar no botao register")
public void clicarNoBotaoRegister() {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	Na(CadastrarUsuarioPage.class).clicarBotaoRegister();
}

@Entao("o sistema cadastra o usuario {string}")
public void oSistemaCadastraOUsuario(String string) {
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
}

@Entao("o sistema mostrara que esta faltando o numero de telefone")
public void oSistemaMostraraQueEstaFaltandoONumeroDeTelefone() {
   assertEquals("phone_mobile is invalid.",driver.findElement(By.xpath("//li[contains(.,'phone')]")).getText());
}

@Entao("o sistema mostrara que o numero postal esta errado")
public void oSistemaMostraraQueONumeroPostalEstaErrado() {
    assertEquals("The Zip/Postal code you've entered is invalid. It must follow this format: 00000",driver.findElement(By.xpath("//li[contains(.,'Zip/Postal')]")).getText());	
}

}
