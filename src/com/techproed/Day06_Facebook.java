package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/User/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://facebook.com/");
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");
        WebElement sifreKutusu = driver.findElement(By.id("pass"));
        sifreKutusu.sendKeys("Test1234");

        sifreKutusu.submit();

        WebElement loginbut = driver.findElement(By.id("loginbutton"));
        loginbut.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        String url = driver.getCurrentUrl();
        System.out.println(url);
        if(url.contains("facebook.com/login/")){
            System.out.println("giris basarisiz");
        } else{
            System.out.println("giris başarılı");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        driver.quit();








    }
}
