package br.com.treinamento.etech.commons;

import org.openqa.selenium.By;

public class AppiumRobot extends BaseTest{

    public void clicarPorTexto(String valor){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@text='"+valor+"']")).click();
    }

    public boolean validaExistenciaTexto(String texto){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath("//android.widget.TextView[@text='"+texto+"']")).isDisplayed();
    }

    public boolean validaTextoCadastro(String texto){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath("//android.view.View[@text='"+texto+"']")).isDisplayed();
    }
}
