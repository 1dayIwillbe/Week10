package harrowGovUk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String baseurl ="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get(baseurl);
        obj.manage().window().maximize();
        obj.close();
    }
}
