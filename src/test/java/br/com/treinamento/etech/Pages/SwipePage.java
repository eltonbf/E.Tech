package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SwipePage {
    public SwipePage(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']")
    private MobileElement swipeUm;
    public MobileElement getSwipeUm(){
        return swipeUm;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chegar até o fim!']")
    private MobileElement mensagemFinal;
    public MobileElement getMensagemFinal(){
        return mensagemFinal;
    }
}
