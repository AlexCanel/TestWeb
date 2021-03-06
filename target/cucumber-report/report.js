$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CarrinhoCompras.feature");
formatter.feature({
  "name": "Carrinho de Compras",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@carrinhocompras"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "adicionar um item no carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.adicionarUmItemNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adicionar um item no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.adicionarUmItemNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o carrinho ira esta com dois produtos",
  "keyword": "Entao "
});
formatter.match({
  "location": "CarrinhoComprasSteps.oCarrinhoIraEstaComDoisProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "excluindo compora carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@carrinhocompras"
    },
    {
      "name": "@excluindocompras"
    }
  ]
});
formatter.step({
  "name": "o usuario clicar no icone da lixeira",
  "keyword": "Quando "
});
formatter.match({
  "location": "CarrinhoComprasSteps.oUsuarioClicarNoIconeDaLixeira()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario clicar no icone da lixeira",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoComprasSteps.oUsuarioClicarNoIconeDaLixeira()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o Sistema informara que o carrinho esta vazio",
  "keyword": "Entao "
});
formatter.match({
  "location": "CarrinhoComprasSteps.oSistemaInformaraQueOCarrinhoEstaVazio()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});