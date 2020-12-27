package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.HibridoLoginFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class HibridoLoginSteps {
    private HibridoLoginFuncionalidade hibridoLoginFuncionalidade;
    private AppiumRobot appiumRobot;

    public HibridoLoginSteps(){
        this.hibridoLoginFuncionalidade = new HibridoLoginFuncionalidade();
    }

    @E("^preencho os dados de acesso$")
    public void preenchoOsDadosDeAcesso() {
        this.hibridoLoginFuncionalidade.preencherDados();
    }


    @Entao("^visualizo mensagem de boas vinda$")
    public void visualizoMensagemDeBoasVinda() {
        this.hibridoLoginFuncionalidade.validaMensagem();
    }
}
