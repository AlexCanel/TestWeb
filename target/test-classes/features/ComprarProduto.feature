#language: pt
#enconding: UTF-8

@comprarProdutos
Funcionalidade: Comprar Produtos
	
	Contexto:
			Quando logar no sistema
			E adicionar um item no carrinho 

	@Compraconcluida
	Cenario: comprar com itens no carrinho
		Quando clicar em Proceed to checkout
		E clicar em Proceed to checkout Address
		E clicar em aceitar os termos de servico
		E clicar em Proceed to checkout Carrier
		E selecionar minha forma de pagamento
		E confirmar minha forma de pagamento
		Entao o sistema me informara que o pedido esta concluido
		
	
	@Compranaoconcluida
	Cenario: comprar com itens no carrinho
		Quando clicar em Proceed to checkout
		E clicar em Proceed to checkout Address
		E clicar em Proceed to checkout Carrier
		Entao o sistema informara que deve concordar com os termos de servico antes de continuar.
		

  	

