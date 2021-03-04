package CasosDeTeste;

import Suporte.*;
import Tarefas.*;
import Utilitarios.EsperaFixa;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import static Suporte.Relatorio.log;

public class RealizarCompraComSucesso extends TesteBase {

    private WebDriver driver = this.pegarDriver();

    LoginTarefas login = new LoginTarefas(driver);
    HomeTarefas homePage = new HomeTarefas(driver);
    DetalhaProdutoTarefa detalhaProduto = new DetalhaProdutoTarefa(driver);
    CarrinhoTarefa carrinho = new CarrinhoTarefa(driver);

    @Test
    public void realizarCompra() {

        try {
            Relatorio.createTest("Realizar Compra com Sucesso" , TipoRelatorio.INDIVIDUAL);

            EsperaFixa.aguardaEmSegundos(2);
            login.realizarLogin();
            homePage.selecionarProduto();
            detalhaProduto.adicionarNoCarrinho();
            carrinho.realizarChekout();

        }catch (Exception e){
            log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }

    }

}