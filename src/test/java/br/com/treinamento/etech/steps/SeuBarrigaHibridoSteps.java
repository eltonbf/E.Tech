package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaHibridoFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class SeuBarrigaHibridoSteps {
    private SeuBarrigaHibridoFuncionalidade seuBarrigaHibridoFuncionalidade;
    private AppiumRobot appiumRobot;

    public SeuBarrigaHibridoSteps(){
        this.seuBarrigaHibridoFuncionalidade = new SeuBarrigaHibridoFuncionalidade();
    }


    @E("^seleciono \"([^\"]*)\"$")
    public void seleciono(){
        this.seuBarrigaHibridoFuncionalidade.selecionarNovoUsuario();
    }

    @E("^preencho os dados de cadastro$")
    public void preenchoOsDadosDeCadastro() {
        this.seuBarrigaHibridoFuncionalidade.preencherDados();
    }

    @Entao("^visualizo as informações de cadastro$")
    public void visualizoAsInformaçõesDeCadastro() {
        Assert.assertTrue(this.seuBarrigaHibridoFuncionalidade.validaUsuarioCadastrado());
    }

    @Entao("^visualizo a mensagem de sucesso$")
    public void visualizoAMensagemDeSucesso() {
        Assert.assertTrue(this.seuBarrigaHibridoFuncionalidade.validaUsuarioCadastrado());
    }
}
