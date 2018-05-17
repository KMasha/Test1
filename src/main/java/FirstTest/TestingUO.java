package FirstTest;

import cz.etnetera.testrail.adapter.junit.TRTest;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class TestingUO {

//    private static WebDriver driver;
//    private static JSONObject newRun;
//    private static APIClient newCon;
    private static JSONObject newAdd;
    private static Integer val;
    private static String comment;
    private static String defects;

    @TRTest(testCaseId = 1)
    static void Logins(int i, WebDriver driver) throws IOException, APIException {
        System.out.println("Логирование прошло");

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

    @TRTest(testCaseId = 2)
    static void Report(int i, WebDriver driver) throws IOException, APIException {
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
    static void Print(int i, WebDriver driver) throws IOException, APIException {
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


    @TRTest(testCaseId = 56) // проверка обращения назначения страховой пенсии
    static void PurposeSP(int i, WebDriver driver) throws IOException, APIException, InterruptedException {

        driver.get("http://192.168.221.143:9080/clientServiceWeb/mainComponentsInit.do");

        Select selectByVisibleText = new Select (driver.findElement(By.id("categories")));
        selectByVisibleText.selectByVisibleText("Застрахованное лицо");

        Select selectByVisibleText1 = new Select (driver.findElement(By.id("addressType")));
        selectByVisibleText1.selectByVisibleText("Письменное");

        Select selectByVisibleText2 = new Select (driver.findElement(By.id("addressTheme")));
        selectByVisibleText2.selectByVisibleText("Пенсии, ЕДВ и иные социальные выплаты");

        Select selectByVisibleText3 = new Select (driver.findElement(By.id("addressReason")));
        selectByVisibleText3.selectByVisibleText("Назначение страховой пенсии");

        Select selectByVisibleText4 = new Select (driver.findElement(By.id("addressReasonDescription")));
        selectByVisibleText4.selectByIndex(1); //По старости (ст.8 № 400-ФЗ)

        WebElement button = driver.findElement(By.id("btnGenerateForm")); //"Сформировать форму регистрации"
        button.click();

        WebElement snils = driver.findElement(By.id("txtpersnum")); //заполнение поля СНИЛС
        snils.sendKeys("11111111145");

        WebElement button1 = driver.findElement(By.cssSelector("[value='Заполнить поля из ПТК НВП']"));
        button1.click();

        Thread.sleep(5000);

        WebElement button2 = driver.findElement(By.id("registrationButton"));
        button2.click();


        try { driver.findElement(By.id("pku_button")).isEnabled(); // проверяем зарегистрировалось ли обращение

            WebElement button3 = driver.findElement(By.id("pku_button"));
            button3.click();

           val = 1;
            comment = "Работает";
            defects = "";

        } catch (Exception e) {
            val = 5;
            comment = "Сообщение не зарегистрировалось";
            defects = "";
        }

//        AddResultForCase add = new AddResultForCase();
//        newAdd = add.AddResultForCase(val,comment,defects,i);
//        driver.quit();
    }


}
