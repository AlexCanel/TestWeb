$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ComprarProduto.feature");
formatter.feature({
  "name": "Comprar Produtos",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@comprarProdutos"
    }
  ]
});
formatter.scenario({
  "name": "comprar com itens no carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@comprarProdutos"
    },
    {
      "name": "@Compraconcluida"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Proceed to checkout",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.clicarEmProceedToCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Proceed to checkout Address",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.clicarEmProceedToCheckoutAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em aceitar os termos de servico",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.clicarEmAceitarOsTermosDeServico()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Proceed to checkout Carrier",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.clicarEmProceedToCheckoutCarrier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar minha forma de pagamento",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.selecionarMinhaFormaDePagamento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmar minha forma de pagamento",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.confirmarMinhaFormaDePagamento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema me informara que o pedido esta concluido",
  "keyword": "Entao "
});
formatter.match({
  "location": "ComprarProdutosSteps.oSistemaMeInformaraQueOPedidoEstaConcluido()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "comprar com itens no carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@comprarProdutos"
    },
    {
      "name": "@Compranaoconcluida"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Proceed to checkout",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.clicarEmProceedToCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Proceed to checkout Address",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.clicarEmProceedToCheckoutAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Proceed to checkout Carrier",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.clicarEmProceedToCheckoutCarrier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema informara que deve concordar com os termos de servico antes de continuar.",
  "keyword": "Entao "
});
formatter.match({
  "location": "ComprarProdutosSteps.oSistemaInformaraQueDeveConcordarComOsTermosDeServicoAntesDeContinuar()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d104.0.5112.29)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-V1RBSM7\u0027, ip: \u0027192.168.1.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.29, chrome: {chromedriverVersion: 104.0.5112.20 (9ac43f954ebb..., userDataDir: C:\\Users\\Alexp\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55428}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 6393c19be01e4c661c19eb0e7dc63013\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:294)\r\n\tat utils.Utils.capturarTela(Utils.java:31)\r\n\tat stepsDefinitions.Hooks.tearDown(Hooks.java:54)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
});