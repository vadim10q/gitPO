package FirstTest;

import org.openqa.selenium.*;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.Objects;

public class FirstTest {

   /* @Test
    public void FindInformationAboutDetectionAndMasking()
    {
        WebDriver webDriver= new ChromeDriver();
        webDriver.get("https://tanki.su");
        webDriver.findElements(By.xpath("//span[@class='nav-submenu_arrow js-mainmenu-arrow']")).get(1).click();
        webDriver.findElements(By.xpath("//a[@class='nav-detail_link js-portal-menu-link-text']")).get(5).click();
        webDriver.findElements(By.xpath("//a[@class='newcomers-menu_link']")).get(2).click();
        WebElement element = webDriver.findElement(By.xpath("//a[@id='spotting_concealment']"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test
    public void ICanWin()
    {
        WebDriver webDriver= new ChromeDriver();
        webDriver.get("https://pastebin.com");
        webDriver.findElement(By.xpath("//textarea[@class='textarea -form js-paste-code']")).sendKeys("Hello from WebDriver");
        webDriver.findElements(By.xpath("//span[@class='select2-selection__rendered']")).get(2).click();
        webDriver.findElements(By.xpath("//li[@class='select2-results__option']")).get(1).click();
        webDriver.findElement(By.id("postform-name")).sendKeys("helloweb");
        webDriver.findElement(By.xpath("//button[@class='btn -big']")).click();
    }


    @Test
    public void BringItOn()
    {
        String str = "how to gain dominance among developers";
        String mainCode = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";
        WebDriver webDriver= new ChromeDriver();
        webDriver.get("https://pastebin.com");
        webDriver.findElement(By.xpath("//textarea[@class='textarea -form js-paste-code']")).sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
        webDriver.findElements(By.xpath("//span[@class='select2-selection__rendered']")).get(1).click();
        webDriver.findElements(By.xpath("//li[@class='select2-results__option']")).get(1).click();

        webDriver.findElements(By.xpath("//span[@class='select2-selection__rendered']")).get(2).click();
        webDriver.findElements(By.xpath("//li[@class='select2-results__option']")).get(1).click();
        webDriver.findElement(By.id("postform-name")).sendKeys("how to gain dominance among developers");
        webDriver.findElement(By.xpath("//button[@class='btn -big']")).click();
        String str2 = webDriver.findElement(By.xpath("//div[@class='info-top']")).getText();
        Assert.assertTrue(Objects.equals(str2, str));
        String str3 = webDriver.findElement(By.xpath("//div[@class='de1']")).getText();
        Assert.assertTrue(Objects.equals(mainCode,str3));
    }*/

    @Test
    public void HurtMePlenty() throws InterruptedException {
        WebDriver webDriver= new ChromeDriver();
        webDriver.get("https://cloud.google.com/");
        webDriver.findElement(By.xpath("//input[@class='devsite-search-field devsite-search-query']")).click();
        webDriver.findElement(By.xpath("//input[@class='devsite-search-field devsite-search-query']")).sendKeys("Google Cloud Platform Pricing Calculator");
        webDriver.findElement(By.xpath("//input[@class='devsite-search-field devsite-search-query']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        webDriver.findElements(By.xpath("//a[@class='gs-title']")).get(0).click();

        Thread.sleep(6000);
        webDriver.findElement(By.xpath("//button[@class='md-fab md-mini cpc-tooltip-button md-button md-ink-ripple']")).click();
        //эта хуета сломана
    }


}
