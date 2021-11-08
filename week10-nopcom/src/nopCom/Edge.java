package nopCom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl ="https://www.nopcommerce.com/en/demo";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver obj = new EdgeDriver();
        obj.get(baseUrl);
        obj.manage().window().maximize();
        obj.close();
    }
}
