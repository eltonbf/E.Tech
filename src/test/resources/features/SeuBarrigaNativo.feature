#language: pt
#enconding: UTF-8
#Author: Elton Ferreira


Funcionalidade: Seu Barriga Nativo

  @mobile @seubarriganativo
  Cenario: Validar mensagem de erro
    Dado que esteja na aplicação
    E toco no botão "SeuBarriga Nativo"
    E preencho os dados obrigatorios
    Quando toco no botão "ENTRAR"
    Entao visualizo a mensagem de erro