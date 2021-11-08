package nopCom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl ="https://www.nopcommerce.com/en/demo";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get(baseUrl);
        obj.manage().window().fullscreen();
        obj.close();
    }

}

