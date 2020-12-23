package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaNativoFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;


public class SeuBarrigaNativoSteps {
    private SeuBarrigaNativoFuncionalidade seuBarrigaNativoFuncionalidade;

    public SeuBarrigaNativoSteps(){
        this.seuBarrigaNativoFuncionalidade = new SeuBarrigaNativoFuncionalidade();
    }


    @E("^preencho os dados obrigatorios$")
    public void preenchoOsDadosObrigatorios() {
        this.seuBarrigaNativoFuncionalidade.preencherCampoNome();
        this.seuBarrigaNativoFuncionalidade.preencherCampoSenha();
    }

    @Entao("^visualizo a mensagem de erro$")
    public void visualizoAMensagemDeErro() {
        Assert.assertTrue(this.seuBarrigaNativoFuncionalidade.validaExistenciaErroTela());
    }

}
