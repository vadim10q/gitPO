package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OzonSecondItemPage {
    WebDriver driver = new ChromeDriver();
 public void EnterColor(){
     WebElement clickblue =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[1]/aside/div[6]/div[2]/div/label[3]/div[2]"));
     clickblue.click();
 }
    public void AddToCard()
    {
        WebElement vkorziny =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[2]/div[5]/div[1]/div/div/div[1]/div[1]/div[3]/div/div/div/button"));
        vkorziny.click();
    }
    public void SearchEnable()
    {
        WebElement onekorzina = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[4]/a[2]/span[1]"));
        Assert.assertTrue(onekorzina.isEnabled());
    }
public void EnterNumbersArea()
{
    WebElement firstnum = driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[1]/aside/div[3]/div[2]/div[2]/div[1]/div/input"));
    firstnum.click();
    firstnum.clear();
    firstnum.sendKeys("10");
    WebElement secondnum = driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[1]/aside/div[3]/div[2]/div[2]/div[2]/div/input"));
    secondnum.click();
    secondnum.clear();
    secondnum.sendKeys("300");
}
public void CheckLikesItems()
{

    WebElement izb =  driver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div/div[2]/div[2]/div[2]/div[5]/div[1]/div/div/div[1]/div[4]/div[1]/div/div/button/span/svg/path[2]"));
    izb.click();
    WebElement ineizb = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[4]/a[1]/span[1]"));
    Assert.assertTrue(ineizb.isEnabled());
}
}
