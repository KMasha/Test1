package FirstTest;

import cz.etnetera.testrail.adapter.junit.TRTest;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.IOException;

public class Testing {

    private static WebDriver driver;
    private static JSONObject newRun;
    private static APIClient newCon;
    private static JSONObject newAdd;
    private static Integer val;
    private static String comment;
    private static String defects;


    @TRTest(testCaseId = 1)
    static void Logins(int i) throws IOException, APIException {

//        System.setProperty("webdriver.chrome.driver", "/home/user/Soft/chromedriver");
//        driver = new ChromeDriver();
        HtmlUnitDriver driver = new HtmlUnitDriver(true);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://192.168.221.143:9080/clientServiceWeb/login.html");
        driver.get("http://" + Start.argumentIPKS + "/clientServiceWeb/login.html");


        WebElement login = driver.findElement(By.name("j_username"));
        login.sendKeys("db2admin");


        WebElement pass = driver.findElement(By.name("j_password"));
        pass.sendKeys("db2admin");

        WebElement button = driver.findElement(By.name("action"));
        button.click();

        try { driver.findElement(By.name("button")).isEnabled();

            val = 1;
            comment = "Работает";
            defects = "";

        } catch (Exception e) {
            val = 5;
            comment = "Не работает";
            defects = "KS-1";
        }
        AddResultForCase add = new AddResultForCase();
        newAdd = add.AddResultForCase(val,comment,defects,i);
        driver.quit();
//        Assert.assertEquals(driver.findElement(By.name("button")),driver.findElement(By.name("button")));
    }

    @TRTest(testCaseId = 2)
//    @Ignore
    static void Report(int i) throws IOException, APIException {
        System.out.println("Отчет сформировался");

        try { driver.findElement(By.name("button")).isDisplayed();

            val = 1;
            comment = "Работает";
            defects = "";

        } catch (Exception e) {
            val = 5;
            comment = "Не работает";
            defects = "KS-1";
        }
        AddResultForCase add = new AddResultForCase();
        newAdd = add.AddResultForCase(val,comment,defects,i);

    }

    @TRTest(testCaseId = 34)
    static void Print(int i) throws IOException, APIException {
        System.out.println("Отчет распечатался");

        try { driver.findElement(By.name("button")).isDisplayed();

            val = 1;
            comment = "Работает";
            defects = "";

        } catch (Exception e) {
            val = 5;
            comment = "Не работает";
            defects = "KS-1";
        }
        AddResultForCase add = new AddResultForCase();
        newAdd = add.AddResultForCase(val,comment,defects,i);

    }
}
