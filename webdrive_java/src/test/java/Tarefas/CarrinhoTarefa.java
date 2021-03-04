package Tarefas;

import PageObjects.PaginaCarrinho;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CarrinhoTarefa {

    private static WebDriver driver;
    //    private static PaginaInformacao paginaInformacao;
    private static PaginaCarrinho paginaCarrinho;

    public CarrinhoTarefa(WebDriver driver) {

        this.driver = driver;
//        paginaInformacao = new PaginaInformacao(this.driver);
        paginaCarrinho = new PaginaCarrinho(this.driver);
    }

    public void realizarChekout() {

        validaItemCarrinho();
        paginaCarrinho.pegarBotaoCheckout().click();
        validaPaginaDeInformacoes();
    }

    private void validaItemCarrinho() {

        Assertions.assertTrue(paginaCarrinho.pegarTituloDoProduto().isEnabled());
        Assertions.assertEquals(paginaCarrinho.pegarTituloDoProduto().getText(), "Sauce Labs Backpack");
    /*
        try{
            Assertions.assertTrue(paginaCarrinho.pegarTituloDoProduto().isEnabled());
            Assertions.assertEquals(paginaCarrinho.pegarTituloDoProduto().getText(), "Sauce Labs Backpack");
            Report.log(Status.PASS, "Produto adicionado ao carrinho com sucesso", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Produto nao foi adicionado com sucesso", Screenshot.fullPageBase64(driver));
        }
 */
    }

    private void validaPaginaDeInformacoes() {

        Assertions.assertEquals(paginaCarrinho.pegarTituloDaPagina().getText(), "Checkout: Your Information");
        /*
        try{
            Assertions.assertEquals(carrinhoPage.getPageLabel().getText(), "Checkout: Your Information");
            Report.log(Status.PASS, "Pagina Informacoes Carregada", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Pagina Informacoes nao Carregada", Screenshot.fullPageBase64(driver));
        }
         */
    }

}
