#language: pt
#enconding: UTF-8
#Author: Elton Ferreira


Funcionalidade: Seu Barriga Hibrido Novo Usuario

@mobile @hibridonovousuario
Cenario: Validar cadastro de novo usuario
  Dado que esteja na aplicação
  E toco no botão "SeuBarriga Híbrido"
  E toco no botão "Novo usuário?"
  E preencho os dados de cadastro
  Quando toco no botão "Cadastrar"
  Entao visualizo a mensagem de sucesso