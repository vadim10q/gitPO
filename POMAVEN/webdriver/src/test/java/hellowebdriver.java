import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class hellowebdriver {
    public static void  main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ozon.by");

        WebElement searchinput = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[1]/div[2]/input[1]"));
        searchinput.sendKeys("Диван");


        WebElement clickbtn =  driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[2]/div/button/span"));
        clickbtn.click();



        WebElement clickblue =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[1]/aside/div[6]/div[2]/div/label[3]/div[2]/div/div[2]"));
        clickblue.click();

      





//        Thread.sleep(2000);
        //  driver.quit();
    }
}
