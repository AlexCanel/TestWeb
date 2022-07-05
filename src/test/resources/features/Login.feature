#language: pt
#enconding: UTF-8

@testeEmail
Funcionalidade: Cadastrar Usuario

	Contexto:
		Quando eu acionar a barra sign in
		
		
	@emailinvalido
	Cenario: email invalido
		E e informar e um email no campo email address "emaildominio.com"
		E clicar no botao crate account 
		Entao o sistema exibe a mensagem de Invalid email address.
	
	@emailValido	
	Cenario: email valido
		E e informar e um email no campo email address "xxx@dominio.com"
		E clicar no botao crate account 
		Entao abrira a pagina create account
		

		

		
