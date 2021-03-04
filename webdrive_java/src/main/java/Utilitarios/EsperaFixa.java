package Utilitarios;

import org.openqa.selenium.support.ui.Sleeper;

import java.time.Duration;

public class EsperaFixa {

    public static void esperaEmSegundosSleeper(int timeout){
        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(timeout));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //Exemplo de método estático com o Thread.Sleep
    public static void aguardaEmSegundos(int timeout){
        try {
            Thread.sleep(timeout * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}