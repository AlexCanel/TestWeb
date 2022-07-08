#language: pt
#enconding: UTF-8

@testeEmail
Funcionalidade: Cadastrar Usuario

	Contexto:
		Quando eu acionar a barra sign in
		
		
	@cadastraremailinvalido
	Cenario: email invalido
		E e informar e um email no campo email address "emaildominio.com"
		E clicar no botao crate account 
		Entao o sistema exibe a mensagem de Invalid email address.
	
	@cadastraremailValido	
	Cenario: email valido
		E e informar e um email no campo email address "xxx@dominio.com"
		E clicar no botao crate account 
		Entao abrira a pagina create account
		
	@fazendologin
		Cenario: fazer login no sistema
			E digitar para logar o emai "joaogomes@email.com"
			E informar uma senha para logoar "123456"
			E cliar em logar
			Entao o sistema informara que o usuario esta logado
			
	
		

		

		
