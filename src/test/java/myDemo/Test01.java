package myDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test01 {
    @Test
    public  void setUp(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
