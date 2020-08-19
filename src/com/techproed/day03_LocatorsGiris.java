package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/User/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");


        // ilk webelementimizi buluyoruz.
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement signinKutusu = driver.findElement(By.name("commit"));
        signinKutusu.click();
        String baslik = driver.getTitle();
        if(baslik.equals("Address Book")){
            System.out.println("Giris Basarili");
        }else{
            System.out.println("Giris Basarisiz");
        }













    }

}
