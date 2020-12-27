package br.com.treinamento.etech.Pages;

import cucumber.api.java.en_lol.AN;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SeuBarrigaHibridoPage {

    public SeuBarrigaHibridoPage(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Novo usuário?']")
    private MobileElement btnNovoUsuario;
    public MobileElement getBtnNovoUsuario() {
        return btnNovoUsuario;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='nome']")
    private MobileElement nome;
    public MobileElement getNome() {
        return nome;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='email']")
    private MobileElement email;
    public MobileElement getEmail() {
        return email;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='senha']")
    private MobileElement senha;
    public MobileElement getSenha() {
        return senha;
    }

    @AndroidFindBy(xpath = "//android.view.View[@text = 'Usuário inserido com sucesso']")
    private MobileElement mensagem;
    public MobileElement getMensagem() {
        return mensagem;
    }
}
