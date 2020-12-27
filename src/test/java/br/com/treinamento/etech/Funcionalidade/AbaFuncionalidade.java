package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.AbaPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AbaFuncionalidade extends BaseTest {
    private AbaPage abaPage;
    private AppiumRobot appiumRobot;

    public AbaFuncionalidade(){
        this.abaPage = new AbaPage(driver);
        this.appiumRobot = new AppiumRobot();
    }

    public void selecionoAba(){
        driverWait.until(ExpectedConditions.visibilityOf(this.abaPage.getAba2()));
        this.abaPage.getAba2().click();
    }

    public boolean verificaConteudo1(){
        return this.appiumRobot.validaExistenciaTexto("Este é o conteúdo da Aba 1");
    }
    public boolean verificaConteudo2(){
        return this.appiumRobot.validaExistenciaTexto("Este é o conteúdo da Aba 2");
    }
}
