package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.HibridoLoginPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HibridoLoginFuncionalidade extends BaseTest {
    private HibridoLoginPage hibridoLoginPage;
    private AppiumRobot appiumRobot;
    private String email = "testelogin@teste.com";
    private String senha = "12345";

    public HibridoLoginFuncionalidade(){
        this.hibridoLoginPage = new HibridoLoginPage(driver);
        this.appiumRobot = new AppiumRobot();
    }



    public void preencherDados(){
        driverWait.until(ExpectedConditions.visibilityOf(this.hibridoLoginPage.getEmail()));
        this.hibridoLoginPage.getEmail().sendKeys(email);
        this.hibridoLoginPage.getSenha().sendKeys(senha);
    }

    public boolean validaMensagem(){
        return this.appiumRobot.validaExistenciaTexto("Seu Barriga. Nunca mais esqueça de pagar o aluguel.");
    }

}
