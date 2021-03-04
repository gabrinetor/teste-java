package PageObjects;

import Utilitarios.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaCarrinho {

    private WebDriver driver;
    private Esperas espera;

    public PaginaCarrinho(WebDriver driver) {
        espera = new Esperas(driver);
        this.driver = driver;
    }

    public WebElement pegarTituloDoProduto(){

        return espera.visibilidadeDoElemento(By.className("inventory_item_name"));
    }

    public WebElement pegarBotaoCheckout() {

        return espera.visibilidadeDoElemento(By.xpath("//div[@class='cart_footer']/a[@class='btn_action checkout_button']"));

    }

    public WebElement pegarTituloDaPagina() {

        return espera.visibilidadeDoElemento(By.className("subheader"));

    }
}