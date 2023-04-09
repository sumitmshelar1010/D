package MainPackage.SeleniumChromeDriver.locators.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectionMethod {//DROPDOWN USING SELECT CLASS
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");
        WebElement we = wd.findElement(By.id("carselect"));
        Select sl = new Select(we);
        sl.selectByIndex(2);
        Thread.sleep(3000);
        sl.selectByValue("benz");
       Thread.sleep(3000);
        sl.selectByVisibleText("Honda");
       Thread.sleep(3000);
        wd.close();
    }
}
