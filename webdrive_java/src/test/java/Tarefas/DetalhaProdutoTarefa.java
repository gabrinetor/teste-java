package Tarefas;

import PageObjects.PaginaCarrinho;
import PageObjects.PaginaDetalheProduto;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class DetalhaProdutoTarefa {


    private static WebDriver driver;
    private static PaginaDetalheProduto detalheProduto;
    private static PaginaCarrinho carrinho;

    public DetalhaProdutoTarefa(WebDriver driver) {

        this.driver = driver;
        detalheProduto = new PaginaDetalheProduto(driver);
        carrinho = new PaginaCarrinho(driver);

    }

    public void adicionarNoCarrinho(){

        detalheProduto.pegaBotaoAdicionarNoCarrinho().click();
        detalheProduto.pegarBotaoCarrinho().click();
        validaCarrinho();

    }

    private void validaCarrinho(){

        String rotulo = carrinho.pegarTituloDaPagina().getText();
        Assertions.assertEquals(rotulo, "Your Cart");

//        try{
//            String rotulo = carrinho.pegarTituloDaPagina().getText();
//            Assertions.assertEquals(rotulo, "Your Cart");
//            Report.log(Status.INFO,"Pagina Carrinho Carregada", Screenshot.fullPageBase64(driver));
//            /* coloquei INFO para exemplificar que tem outras opcoes */
//        }catch (Exception e){
//
//            Report.log(Status.FAIL,"Produto não foi adicionado no carrinho",Screenshot.fullPageBase64(driver));
//
//        }
    }

}
