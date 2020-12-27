package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaHibridoPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Locale;

public class SeuBarrigaHibridoFuncionalidade extends BaseTest {
    private SeuBarrigaHibridoPage seuBarrigaHibridoPage;
    private AppiumRobot appiumRobot;
    private String nome, email, senha;
    private Faker faker;

    public SeuBarrigaHibridoFuncionalidade(){
        this.seuBarrigaHibridoPage = new SeuBarrigaHibridoPage(driver);
        this.appiumRobot = new AppiumRobot();
        this.faker = new Faker(new Locale("pt-BR"));
    }

    public void selecionarNovoUsuario(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoPage.getBtnNovoUsuario()));
        this.seuBarrigaHibridoPage.getBtnNovoUsuario().click();

    }

    public void preencherDados(){
        nome = faker.name().fullName();
        this.seuBarrigaHibridoPage.getNome().sendKeys(nome);
        email =faker.internet().emailAddress();
        this.seuBarrigaHibridoPage.getEmail().sendKeys(email);
        senha = faker.internet().password();
        this.seuBarrigaHibridoPage.getSenha().sendKeys(senha);
    }

    public boolean validaUsuarioCadastrado(){
        return this.appiumRobot.validaTextoCadastro("Usuário inserido com sucesso");
    }

}
