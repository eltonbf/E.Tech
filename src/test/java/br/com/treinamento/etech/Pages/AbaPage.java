package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AbaPage {
    public AbaPage(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Este é o conteúdo da Aba 1']")
    private MobileElement conteudo1;
    public MobileElement getConteudo1(){
        return conteudo1;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Este é o conteúdo da Aba 2']")
    private MobileElement conteudo2;
    public MobileElement getConteudo2(){
        return conteudo2;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ABA 2']")
    private MobileElement aba2;
    public MobileElement getAba2(){
        return aba2;
    }
}
