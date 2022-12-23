package FirstTest;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchBlueSofa {
    @Test
    public void commonSearchTest() {
        //Найти синий диван и добавить его в корзину

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ozon.by");

        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[1]/div[2]/input[1]"));
        searchInput.sendKeys("Диван");


        WebElement clickBtn =  driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[2]/div/button/span"));
        clickBtn.click();



        WebElement clickBlue =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[1]/aside/div[6]/div[2]/div/label[3]/div[2]"));
        clickBlue.click();

        WebElement Vkorziny =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[2]/div[5]/div[1]/div/div/div[1]/div[1]/div[3]/div/div/div/button"));
        Vkorziny.click();



        WebElement oneKorzina = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[4]/a[2]/span[1]"));

        Assert.assertTrue(oneKorzina.isEnabled());

//Тест номер 2




    }
    @Test
    public void SecondTestSearch() {
        //Найти телефеон и указать цену от 10 до 300 и доабвить в избранное

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ozon.by");

        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[1]/div[2]/input[1]"));
        searchInput.sendKeys("Телефон");


        WebElement clickBtn =  driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[2]/div/button/span"));
        clickBtn.click();

        WebElement firstNum = driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[1]/aside/div[3]/div[2]/div[2]/div[1]/div/input"));
        firstNum.click();
        firstNum.clear();
        firstNum.sendKeys("10");

        WebElement secondNum = driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[1]/aside/div[3]/div[2]/div[2]/div[2]/div/input"));
        secondNum.click();
        secondNum.clear();
        secondNum.sendKeys("300");

        WebElement izb =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[2]/div[5]/div[1]/div/div/div[1]/div[4]/div[1]/div/div/button/span/svg/path[2]"));
        izb.click();


        WebElement ineIzb = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[4]/a[1]/span[1]"));

        Assert.assertTrue(ineIzb.isEnabled());






    }
}
