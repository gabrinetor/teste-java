package Tarefas;

import PageObjects.PaginaHome;
import PageObjects.PaginaLogin;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginTarefas {

    private static WebDriver driver;
    private static PaginaLogin login;
    private static PaginaHome selecionaProduto;

    public LoginTarefas(WebDriver driver) {

        this.driver = driver;
        login = new PaginaLogin(this.driver);
        selecionaProduto = new PaginaHome(this.driver);
    }

    public void realizarLogin(){

        login.pegarInputNomeUsuario().sendKeys("standard_user");
        login.pegarInputPassword().sendKeys("secret_sauce");
        login.pegarBotaoLogin().click();
        validaLogin();

    }

//    public void realizarLoginParametrizado(String usuario, String senha){
//
//        login.pegarInputNomeUsuario().sendKeys(usuario);
//        login.pegarInputPassword().sendKeys(senha);
//        login.pegarBotaoLogin().click();
//        validaLogin();
//
//    }

    private void validaLogin(){
        try{
            String rotulo = selecionaProduto.pegarTextoDoCabecalhoDaHome().getText();
            Assertions.assertEquals(rotulo, "Products");
            //Report.log(Status.PASS, "Login Realizado : " + rotulo , Screenshot.fullPageBase64(driver));
        }catch (Exception e){

            //Report.log(Status.FAIL,"Login Falhou", Screenshot.fullPageBase64(driver));
        }
    }
}
