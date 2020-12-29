package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.OpcaoEscondidaPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpcaoEscondidaFuncionalidade extends BaseTest {
    private OpcaoEscondidaPage opcaoEscondidaPage;
    private AppiumRobot appiumRobot;
    private TouchAction touchAction;

    public OpcaoEscondidaFuncionalidade(){
        this.opcaoEscondidaPage = new OpcaoEscondidaPage(driver);
        this.appiumRobot = new AppiumRobot();
        this.touchAction = new TouchAction(driver);
    }

    public boolean verificarMensagem(){
        return this.appiumRobot.validaExistenciaTexto("Você achou essa opção");
    }

    public void tocarBotaoOK(){
        this.opcaoEscondidaPage.getBtnOK();
    }


    public void moverTela(){

        this.touchAction.longPress(new PointOption().withCoordinates(500, 1000))
                .moveTo(new PointOption().withCoordinates(500, 200))
                .release()
                .perform();

    }
}
