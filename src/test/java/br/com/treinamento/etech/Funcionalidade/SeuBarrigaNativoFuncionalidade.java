package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaNativoPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeuBarrigaNativoFuncionalidade extends BaseTest {
    private SeuBarrigaNativoPage seuBarrigaNativoPage;
    private AppiumRobot appiumRobot;
    private String nome = "Elton";


    public SeuBarrigaNativoFuncionalidade(){
        this.seuBarrigaNativoPage = new SeuBarrigaNativoPage(driver);
        this.appiumRobot = new AppiumRobot();

    }


    public void preencherCampoNome(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaNativoPage.getNome()));
        this.seuBarrigaNativoPage.getNome().sendKeys(nome);
    }

    public void preencherCampoSenha(){
        this.seuBarrigaNativoPage.getSenha().sendKeys("12345");
    }

    public boolean validaExistenciaErroTela(){
        return this.appiumRobot.validaExistenciaTexto("Problemas com o login"); }
}
