package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.OrderPage;

public class ComprarProdutosSteps {
	
	@Quando("clicar em Proceed to checkout")
	public void clicarEmProceedToCheckout() {
	    Na(OrderPage.class).proceedToCheckout();
	}
	
	@Quando("clicar em Proceed to checkout Address")
	public void clicarEmProceedToCheckoutAddress() {
		 Na(OrderPage.class).proceedToCheckoutAddress();
	}

	@Quando("clicar em aceitar os termos de servico")
	public void clicarEmAceitarOsTermosDeServico() {
		Na(OrderPage.class).selecionarTermosServicos();
	}
	
	@Quando("clicar em Proceed to checkout Carrier")
	public void clicarEmProceedToCheckoutCarrier() {
		 Na(OrderPage.class).proceedToCheckoutCarrier();
	}

	@Quando("selecionar minha forma de pagamento")
	public void selecionarMinhaFormaDePagamento() {
		Na(OrderPage.class).formaPagamento();
	}

	@Quando("confirmar minha forma de pagamento")
	public void confirmarMinhaFormaDePagamento() {
		Na(OrderPage.class).confirmarOrdem();
	}

	@Entao("o sistema me informara que o pedido esta concluido")
	public void oSistemaMeInformaraQueOPedidoEstaConcluido() {
		 assertEquals("Your order on My Store is complete.",driver.findElement(By.xpath("//p[contains(@class,\"alert alert-success\")]")).getText());	
	}
	
	@Entao("o sistema informara que deve concordar com os termos de servico antes de continuar.")
	public void oSistemaInformaraQueDeveConcordarComOsTermosDeServicoAntesDeContinuar() {
		assertEquals("You must agree to the terms of service before continuing.",driver.findElement(By.xpath("//p[contains(@class,\"fancybox-error\")]")).getText());
	}
}
