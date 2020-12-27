package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.AbaFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AbaSteps {
    private AbaFuncionalidade abaFuncionalidade;
    private AppiumRobot appiumRobot;

    public AbaSteps(){
        this.abaFuncionalidade = new AbaFuncionalidade();
    }


    @E("^verifico o conteudo da aba$")
    public void verificoOConteudoDaAba() {
        this.abaFuncionalidade.verificaConteudo1();
    }

    @Entao("^verifico o conteudo da aba dois$")
    public void verificoOConteudoDaAbaDois() {
        this.abaFuncionalidade.verificaConteudo2();
    }

    @Quando("^toco na aba dois$")
    public void tocoNaAbaDois() {
        this.abaFuncionalidade.selecionoAba();
    }
}
