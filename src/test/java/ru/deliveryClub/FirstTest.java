package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSettings {
    @FindBy(xpath = "/html/body/div/div/main/div[1]/div[2]/a/svg/use")
    public WebElement moreButton;

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://www.virginbet.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Virgin Bet – Bet £10, Get £20"));

        WebElement header = driver.findElement(By.cssSelector("[class=\"sc-8ixzj8-8 cpAlns\"]"));

        header.findElement(By.cssSelector("[href=\"/login\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"sc-1ntwevp-0 cHMxoT\"]")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));

        WebElement inputName = driver.findElement(By.cssSelector("[class=\"sc-1ntwevp-8 iPAfwa\"]"));

        inputName.findElement(By.cssSelector("input")).sendKeys("vbtest23");

        WebElement inputPassword = driver.findElement(By.cssSelector("[class=\"sc-1ntwevp-8 sc-1ntwevp-9 gMHCAc\"]"));

        inputPassword.findElement(By.cssSelector("input")).sendKeys("Sb123456");

        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        Thread.sleep(3000);

        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/body/div/div/main/div[1]/div[2]/a")));
        driver.findElement(By.xpath("/html/body/div/div/main/div[1]/div[2]/a")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div/div/div/button/span ")).click();

        driver.findElement(By.xpath("//a[text()=\"Help & information\"]")).click();
    }

}


