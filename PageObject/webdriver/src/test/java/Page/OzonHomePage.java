package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OzonHomePage {
    WebDriver driver = new ChromeDriver();
    public void openpage()
    {

        driver.get("https://www.ozon.by");
    }
    public void SearchItem()
    {

        WebElement searchinput = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[1]/div[2]/input[1]"));
        searchinput.sendKeys("Диван");
        WebElement clickbtn =  driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[2]/div/button/span"));
        clickbtn.click();
    }
public void SerachTelephone()
{
    WebElement searchinput = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[1]/div[2]/input[1]"));
    searchinput.sendKeys("Телефон");
    WebElement clickbtn =  driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div[1]/form/div[2]/div/button/span"));
    clickbtn.click();
}


}
