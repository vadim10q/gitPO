package Test;

import Page.OzonHomePage;
import Page.OzonSecondItemPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBlueSofa {
    @Test
    public void commonSearchTest() {
        //Найти синий диван и добавить его в корзину
        OzonHomePage firstPage = new OzonHomePage();
        firstPage.openpage();
        firstPage.SearchItem();
        OzonSecondItemPage secondPage = new OzonSecondItemPage();
        secondPage.EnterColor();
        secondPage.AddToCard();
        secondPage.SearchEnable();
    }
    @Test
    public void SecondTestSearch() {
        //Найти телефеон и указать цену от 10 до 300 и доабвить в избранное
        OzonHomePage firstPage = new OzonHomePage();
        firstPage.openpage();
        firstPage.SerachTelephone();
        OzonSecondItemPage secondPage = new OzonSecondItemPage();
        secondPage.EnterNumbersArea();
        secondPage.CheckLikesItems();
    }
}
