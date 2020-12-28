package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SwipeFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SwipeSteps {
    private SwipeFuncionalidade swipeFuncionalidade;
    private AppiumRobot appiumRobot;
    
    public SwipeSteps(){
        this.swipeFuncionalidade = new SwipeFuncionalidade();
    }
    
    @Quando("^movo as telas$")
    public void movoAsTelas() {
        this.swipeFuncionalidade.moverTelas();

    }

    @Entao("^verifico a mensagem final$")
    public void verificoAMensagemFinal() {
        this.swipeFuncionalidade.verificarMensagemFinal();
    }
}
