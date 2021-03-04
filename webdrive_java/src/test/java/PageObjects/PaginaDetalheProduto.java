package PageObjects;

import Utilitarios.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaDetalheProduto {

    private WebDriver driver;
    private Esperas espera;

    public PaginaDetalheProduto(WebDriver driver) {
        espera = new Esperas(driver);
        this.driver = driver;
    }

    public WebElement pegarBotaoCarrinho() {
        return espera.visibilidadeDoElemento(By.xpath("//div[@id='shopping_cart_container']"
                + "/a[@class='shopping_cart_link fa-layers fa-fw']"));
    }

    public WebElement pegaBotaoAdicionarNoCarrinho() {

        return espera.visibilidadeDoElemento(By.xpath("//div[@class='inventory_details_desc_container']/button[@class='btn_primary btn_inventory']"));
    }

    public WebElement pegaTextoNomeDoProduto() {

        return espera.visibilidadeDoElemento(By.className("inventory_details_name"));
    }

}