package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SwipePage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.lang.model.element.Element;

public class SwipeFuncionalidade extends BaseTest {
    private SwipePage swipePage;
    private AppiumRobot appiumRobot;
    private TouchAction touchAction;

    public SwipeFuncionalidade(){
        this.swipePage = new SwipePage(driver);
        this.appiumRobot = new AppiumRobot();
        this.touchAction = new TouchAction(driver);
    }

    public void moverTelas(){
        driverWait.until(ExpectedConditions.visibilityOf(this.swipePage.getSwipeUm()));
        this.touchAction.longPress(new PointOption().withCoordinates(1000, 500))
                .moveTo(new PointOption().withCoordinates(200, 500))
                .release()
                .perform();
        driverWait.until(ExpectedConditions.visibilityOf(this.swipePage.getSwipeUm()));
        this.touchAction.longPress(new PointOption().withCoordinates(1000, 500))
                .moveTo(new PointOption().withCoordinates(200, 500))
                .release()
                .perform();

    }

    public boolean verificarMensagemFinal(){
        return this.appiumRobot.validaExistenciaTexto("Chegar até o fim!");
    }





}
