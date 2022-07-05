#language: pt
#enconding: UTF-8

@cadastrausuario
Funcionalidade: Cadastrar Usuario
	

	Cenario: usuario cadastrar usuario
		Quando  informar o primeiro mome no campo first name "Alex"
		E informar  sobrenome no campo last name "Ferreira Canel"
		E informar uma senha no campo password "123456"
		E informar e um endereco no campo adress "Rua pedro"
		E informar uma cidade "Duque de caxias"
		E informar e um estado no campo State "Alabama"
		E informar e um endereco postal no campo zipostal "00000" 
		E informar e um pais no campo country "United States"
  	E digitar um numero de telefone no campo Mobile phone "2199999999"
  	E clicar no botao register
  	Entao o sistema cadastra o usuario "Alex"
  	

	Cenario: sem numero de telefone
		Quando  informar o primeiro mome no campo first name "Alex"
		E informar  sobrenome no campo last name "Ferreira Canel"
		E informar uma senha no campo password "123456"
		E informar e um endereco no campo adress "Rua pedro"
		E informar uma cidade "Duque de caxias"
		E informar e um estado no campo State "Alabama"
		E informar e um endereco postal no campo zipostal "00000" 
		E informar e um pais no campo country "United States"
		E digitar um numero de telefone no campo Mobile phone "aaaaaa"
  	E clicar no botao register
  	Entao o sistema mostrara que esta faltando o numero de telefone 
  	
  Cenario: Zip/postal formato errado
		Quando  informar o primeiro mome no campo first name "Alex"
		E informar  sobrenome no campo last name "Ferreira Canel"
		E informar uma senha no campo password "123456"
		E informar e um endereco no campo adress "Rua pedro"
		E informar uma cidade "Duque de caxias"
		E informar e um estado no campo State "Alabama"
		E informar e um endereco postal no campo zipostal "@15321" 
		E informar e um pais no campo country "United States"
  	E digitar um numero de telefone no campo Mobile phone "21978744542"
  	E clicar no botao register
  	Entao o sistema mostrara que o numero postal esta errado 
  	

