package myDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App01 {

    public static void main(String[] args) {
        //Variable
        String palabra = "Solera";

        //TestCase01 - Abrir Google
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        //TestCase02 - Rechazar cookies
        WebElement buttonRechazarTodo = driver.findElement(By.id("W0wltc"));
        buttonRechazarTodo.click();

        //TestCase03 - Poner palabra en el buscador
        WebElement buscador = driver.findElement(By.className("gLFyf"));
        buscador.sendKeys(palabra);

        //TestCase04 - Click en buscar
        WebElement buttonBuscar = driver.findElement(By.className("gNO89b"));
        buttonBuscar.submit();

        //Muestra por consola la cantidad de veces que se repite
        System.out.println("Número de veces que se repite la palabra " +palabra+": "+ driver.findElements(By.xpath("//span[contains(text(),'Solera')]|//a[contains(text(),'Solera')]")).size());
        System.out.println("Número de veces que se repite la palabra " +palabra+": "+ driver.findElements(By.xpath("//*[contains(text(),'Solera') or contains(text(),'solera')]")).size());

    }
}
