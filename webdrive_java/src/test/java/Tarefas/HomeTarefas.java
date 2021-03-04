package Tarefas;

import PageObjects.PaginaDetalheProduto;
import PageObjects.PaginaHome;
import PageObjects.PaginaLogin;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HomeTarefas {


    private static WebDriver driver;
    private static PaginaHome homePage;
    private static PaginaDetalheProduto detalhaProduto;

    public HomeTarefas(WebDriver driver) {

        this.driver = driver;
        homePage = new PaginaHome(driver);
        detalhaProduto = new PaginaDetalheProduto(driver);
    }

    public void selecionarProduto(){

        homePage.pegarProdutoLinkTexto().click();
        //Report.log(Status.INFO, "Item selecionado com sucesso", Screenshot.capture(driver));
        validaSelecaoProduto();

    }

    private void validaSelecaoProduto(){

        Assertions.assertTrue(detalhaProduto.pegaTextoNomeDoProduto().isDisplayed());
        /*
        try{
            Assertions.assertTrue(detalhaProduto.pegaTextoNomeDoProduto().isDisplayed());
            Report.log(Status.PASS, "Item selecionado com sucesso", Screenshot.capture(driver));
        } catch (Exception e){
            Report.log(Status.FAIL, "Não foi selecionado nenhum Produto", Screenshot.capture(driver));
        }
         */
    }

}
