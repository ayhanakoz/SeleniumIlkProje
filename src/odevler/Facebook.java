package odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        /*1. Yeni bir class oluşturun :Homework
2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın, Değilse, doğru başlığı(Actual title) yazdırın.
3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
4. Ardından Navigate to https://www.walmart.com/
5. Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
6. Navigate back to facebook
7. Sayfayı yenileyin(refresh)
8. Maximize the window
9. Close the browse

         */
        System.setProperty("webdriver.chrome.driver","C:/Users/User/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com" );
        String faceTitle = driver.getTitle();
        if (faceTitle.contains("Facebook")){
            System.out.println("DOGRU");
        }else {
            System.out.println("DOGRU DEGIL");
            System.out.println("Actual url" + "facebook");
        }
        driver.navigate().to("http://walmart.com");
        String walTitle = driver.getTitle();
        if (walTitle.contains("Walmart.com")){
            System.out.println("DOGRU");
        }
            else{
                System.out.println("DOGRU DEGIL");
            }
            driver.navigate().back();
            driver.navigate().refresh();
            driver.close();






        }





    }

