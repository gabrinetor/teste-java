package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaginaHome {

    private WebDriver driver;

    public PaginaHome(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement pegarTextoDoCabecalhoDaHome(){

        return driver.findElement(By.xpath("//div[@id='inventory_filter_container']/div[@class='product_label']"));
    }

    public WebElement pegarProdutoLinkTexto(){

        return  driver.findElement(By.id("item_4_title_link"));
    }

//    private List<WebElement> pegarElementos(){
//
//        List<WebElement> elements = driver.findElements(By.name("name"));
//        System.out.println("Number of elements:" +elements.size());
//        return elements;
//    }
//
//    public void pegarElementoNome(String nome){
//        for (int i=0; i<pegarElementos().size();i++){
//            System.out.println("Radio button text:" + pegarElementos().get(i).getAttribute("Sauce Labs Onesie"));
//        }
//    }

    /*
    * List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());
        for (int i=0; i<elements.size();i++){
            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }*/
}