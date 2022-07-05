package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
	
	
		@FindBy(name = "customer_firstname")
		public WebElement campoFirstName;
		
		@FindBy(name = "customer_lastname")
		public WebElement campoLastName;
		
		
		@FindBy(name = "passwd")
		public WebElement campoPassword;
		
		@FindBy(name = "address1")
		public WebElement campoAdress1;
		
		@FindBy(name = "city")
		public WebElement campoCity;
		
		@FindBy(name = "id_state") 
		public WebElement campoState;
		
		@FindBy(name = "postcode")
		public WebElement campoZipPostal;
		
		
		@FindBy(name = "id_country")
		public WebElement campoCountry; 
		
		@FindBy(name = "phone_mobile")
		public WebElement campoMobilePhone;
		
		
		@FindBy(name = "submitAccount")
		public WebElement botaoRegister;
		
		
		public void adicionarFirstName(String firstName) {
			campoFirstName.sendKeys(firstName);
		}
		
		public void adicionarLastname(String lastName) {
			campoLastName.sendKeys(lastName);
		}
		
		public void adicionarPassword(String password) {
			campoPassword.sendKeys(password);
		}
		
		public void adicionarAdress1(String adress1) {
			campoAdress1.sendKeys(adress1);
		}
		
		public void adicionarCity(String city) {
			campoCity.sendKeys(city);
		}
			
		public void adicionarState(String state) {
			campoState.click();
			campoState.sendKeys(state);
		}
		
		public void adicionarZipPostal(String zipPostal) {
			campoZipPostal.sendKeys(zipPostal);
			}
			
		public void adicionarCountry(String country) {
			campoCountry.click();
			campoCountry.sendKeys(country);
		}
		
		public void adicionarMobilePhone(String mobilePhone) {
			campoMobilePhone.sendKeys(mobilePhone);
			}
		
		public void clicarBotaoRegister() {
			botaoRegister.click();
		}
		
		public void cadastrarUsuario(String firstName, String lastName, String password, String adress1, String city, String state, String zipPostal, String country, String mobilePhone) {
			campoFirstName.sendKeys(firstName);
			campoLastName.sendKeys(lastName);
			campoPassword.sendKeys(password);
			campoAdress1.sendKeys(adress1);
			campoCity.sendKeys(city);
			campoState.click();
			campoState.sendKeys(state);
			campoZipPostal.sendKeys(zipPostal);
			campoCountry.click();
			campoCountry.sendKeys(country);
			campoMobilePhone.sendKeys(mobilePhone);
			botaoRegister.click();
		}
	


}
