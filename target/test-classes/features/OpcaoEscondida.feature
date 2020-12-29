#language: pt
#enconding: UTF-8
#Author: Elton Ferreira

  Funcionalidade: Opção bem escondida

    @mobile @opcaoescondido
    Cenario:  Validar mensagem de sucesso
      Dado que esteja na aplicação
      E deslizo a tela para cima
      E toco no botão "Opção bem escondida"
      Quando verifico a mensagem de sucesso
      Entao toco em ok