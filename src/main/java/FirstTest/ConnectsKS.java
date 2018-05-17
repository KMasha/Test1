package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class ConnectsKS {
    static WebDriver ConnectKS() {
//    static HtmlUnitDriver ConnectsKS() {

//        System.setProperty("webdriver.chrome.driver", "/home/user/Soft/chromedriver");
        System.setProperty("webdriver.ie.driver", "/home/user/Soft/IEDriverServer");
//        System.setProperty("webdriver.internetexplorerdriver.driver", "/home/user/PlayOnLinux's virtual drives/InternetExplorer8");

        InternetExplorerDriver driver = new InternetExplorerDriver();
//        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//        HtmlUnitDriver driver = new HtmlUnitDriver(true);

//        driver.get("http://192.168.221.143:9080/clientServiceWeb/login.html");

        try {

            driver.get("http://" + Start.argumentIPKS + "/clientServiceWeb/login.html");


            WebElement login = driver.findElement(By.name("j_username"));
            login.sendKeys("db2admin");


            WebElement pass = driver.findElement(By.name("j_password"));
            pass.sendKeys("db2admin");

            WebElement button = driver.findElement(By.name("action"));
            button.click();
            return (driver);
        }

        catch (Exception e){
            Start.log.error("КС недоступна");
            System.exit(1);
            return (null);
        }
    }
}