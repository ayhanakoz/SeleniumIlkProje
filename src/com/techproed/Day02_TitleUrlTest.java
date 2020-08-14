package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/User/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://youtube.com");
        String youTitle = webDriver.getTitle();
        if( youTitle.contains("video") ){
            System.out.println("Video kelimesini içeriyor.");
        }else{
            System.out.println("Video kelimesini İÇERMİYOR.");
        }

        webDriver.quit();






    }
}
