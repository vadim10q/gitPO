import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class hellowebdriver {
    public static void  main(String[] args) throws InterruptedException {
        //Найти синий диван и добавить его в корзину
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ozon.by");


        // WebElement adress =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/header/div[2]/div/ul/li[3]/a"));
  //  adress.click();

        //WebElement addressbtn =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[3]/div/div[1]/a"));
        //addressbtn.click();

       // WebElement smart =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[1]/div[2]/div/a/span/span"));
       // smart.click();

        WebElement searchinput = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[1]/div[2]/input[1]"));
        searchinput.sendKeys("Диван");


        WebElement clickbtn =  driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[2]/div/button/span"));
        clickbtn.click();



        WebElement clickblue =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[1]/aside/div[6]/div[2]/div/label[3]/div[2]/div/div[2]"));
        clickblue.click();

        List<WebElement> vkorziny =  driver.findElements(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[2]/div[5]/div[1]/div/div/div[1]/div[1]/div[3]/div/div/div/button"));
        vkorziny.get(0).click();



        WebElement onekorzina = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[4]/a[2]/span[1]"));




    }
}
