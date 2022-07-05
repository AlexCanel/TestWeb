package utils;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;

public class Utils {

	public static WebDriver driver; // Automatizar o Chorme para os testes

	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe"); // indicando o local onde estar o																				// chorme driver
		driver = new ChromeDriver(); // instanciando o chorme driver
		driver.manage().window().maximize(); // Abrir navegador com tela cheia
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Tempo dde espera para carregamento dos																	// objetos que serao utilizados
		driver.get("http://automationpractice.com/"); // site que sera testado
	}

	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}

	public static void capturarTela(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}

}
