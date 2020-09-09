package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:/java/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Before");
    }
//    @After
//    public void close(){
//        driver.quit();
//        System.out.println("After");
//    }


}
