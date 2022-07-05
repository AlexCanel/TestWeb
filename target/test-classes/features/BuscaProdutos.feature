#language: pt
#enconding: UTF-8

@buscarprodutos
Funcionalidade: Buscar por produtos
	

	Cenario: usuario busca produtos valido
		Quando  quando o usuario digitar na barra de buscas "Short"
		E clicar em buscar 
		Entao o sistema ira mostra o resultado da busca
		
	Cenario: usuario busca produtos inexistentes
		Quando  quando o usuario digitar na barra de buscas "##"
		E clicar em buscar 
		Entao o sistema mostra que nao foram encontrado resultados
  	


  	

  	

