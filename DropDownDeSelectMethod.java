package MainPackage.SeleniumChromeDriver.locators.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDeSelectMethod {//USE OF DESELECT CLASS IN DROPDOWN
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");
        WebElement we = wd.findElement(By.id("multiple-select-example"));
        Select sl = new Select(we);
        sl.selectByIndex(0);
        Thread.sleep(3000);
        sl.selectByValue("orange");
        Thread.sleep(3000);
        sl.selectByVisibleText("Peach");
        Thread.sleep(3000);
        sl.deselectByIndex(0);
        Thread.sleep(3000);
        sl.deselectByValue("orange");
        sl.deselectByVisibleText("Peach");

        wd.close();
        }
    }

