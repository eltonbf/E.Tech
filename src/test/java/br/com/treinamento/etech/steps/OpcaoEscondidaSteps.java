package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.OpcaoEscondidaFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class OpcaoEscondidaSteps {

    private OpcaoEscondidaFuncionalidade opcaoEscondidaFuncionalidade;

    public OpcaoEscondidaSteps(){
        this.opcaoEscondidaFuncionalidade = new OpcaoEscondidaFuncionalidade();
    }


    @Entao("^toco em ok$")
    public void tocoEmOk() {
        this.opcaoEscondidaFuncionalidade.tocarBotaoOK();
    }

    @Quando("^verifico a mensagem de sucesso$")
    public void verificoAMensagemDeSucesso() {
        this.opcaoEscondidaFuncionalidade.verificarMensagem();
    }

    @E("^deslizo a tela para cima$")
    public void deslizoATelaParaCima() {
        this.opcaoEscondidaFuncionalidade.moverTela();
    }
}
