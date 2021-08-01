package com.alseda.mtb;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.interactions.Actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MTBtestFirst {

    public static AndroidDriver driver;

    @BeforeClass
    public static void beforeClass() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");  //A50
//        capabilities.setCapability("deviceName", "R58R34TS57J"); //A51
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.alseda.mtbyl");
        capabilities.setCapability("appActivity", "com.alseda.mtbyl.features.start.splash.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void afterTest() throws MalformedURLException {
        WebElement mainPage = driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Главная\"]/android.widget.ImageView");
        mainPage.click();
    }


    @Test
    public void DBOTEST_1() throws MalformedURLException {
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement one = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
        one.click();
        driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
        WebElement el1 = driver.findElement(By.id("com.alseda.mtbyl:id/oneButton"));
        for (int count = 0; count < 12; count++) {
            el1.click();
        }
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement el2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
        el2.click();
    }

    @Test
    public void DBOTEST_2() throws MalformedURLException {
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.navigate().back();
        WebElement el3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]"));
        el3.click();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        WebElement login = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
        login.click();
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
        MobileElement el4 = (MobileElement) driver.findElement(By.id("com.alseda.mtbyl:id/oneButton"));
        for (int count = 0; count < 6; count++) {
            el4.click();
        }
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
    }


    @Test
    public void DBOTEST_3() throws MalformedURLException {

//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement one = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
//        one.click();
//        driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
//        WebElement el1 = driver.findElement(By.id("com.alseda.mtbyl:id/oneButton"));
//        for (int count = 0; count < 12; count++) {
//            el1.click();
//        }
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement el2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
//        el2.click();


        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
//        выбрать счет
        WebElement schet = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
        schet.click();
//        нажать выписка
        WebElement vipiska = driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Выписка\"]/android.widget.TextView");
        vipiska.click();
//        переключиться на неделю

        WebElement el3 = driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Неделя\"]/android.widget.TextView");
        el3.click();
//        переключиться на месяц
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
        WebElement el4 = driver.findElementByAccessibilityId("Месяц");
        el4.click();
//        переключиться на период
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        WebElement el5 = driver.findElementByAccessibilityId("Период");
        el5.click();

        WebElement redaktirovat = driver.findElementByAccessibilityId("Перейти в режим ввода текста");
        redaktirovat.click();

        String nachalo = "01.01.2021";
        String konec = "01.07.2021";
//        ввести дату начала, конца
        WebElement dataNachalo = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        dataNachalo.sendKeys(nachalo);
        WebElement dataKonec = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        dataKonec.sendKeys(konec);
        driver.navigate().back();
        WebElement ok = driver.findElementById("com.alseda.mtbyl:id/confirm_button");
        ok.click();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

        WebElement operazia = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
        operazia.click();
    }


    @Test
    public void DBOTEST_4() throws MalformedURLException {


//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement one = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
//        one.click();
//        driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
//        WebElement el1 = driver.findElement(By.id("com.alseda.mtbyl:id/oneButton"));
//        for (int count = 0; count < 12; count++) {
//            el1.click();
//        }
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement el2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
//        el2.click();


        WebElement el3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Создать\"]/android.widget.ImageView"));
        el3.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement el4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
        el4.click();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        WebElement el5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        String summa = "100";
//        ввести сумму
        el5.sendKeys(summa);
        WebElement el6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"));
        el6.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        продолжить
        WebElement el7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el7.click();
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
//        выбор плательщика
        WebElement el8 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el8.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement elX2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
        elX2.click();
        driver.manage().timeouts().implicitlyWait(300000, TimeUnit.MILLISECONDS);

        // click prodolzit
        WebElement prod = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
        prod.click();
        driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS);
// наименование
        WebElement el12 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el12.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
//        справочник
        WebElement el13 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
        el13.click();
        //   выбор в справочнике
        WebElement el14 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el14.click();
        //   выбор в справочнике
        driver.findElementByClassName("android.widget.Button").click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        назначение
        WebElement el15 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el15.click();
//        выбор в назначении
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement el16 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RadioButton"));
        el16.click();
//        продолжить
        driver.findElementByClassName("android.widget.Button").click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        очередь
        WebElement el17 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el17.click();
//        вид выбор очереди
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement el18 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el18.click();
//        вид платежа
        WebElement el19 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el19.click();
//        выбор вида
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement el20 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el20.click();
//        код платежа
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement el21 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el21.click();
//        выбор кода
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement el22 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el22.click();
//        создать
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
        driver.findElementByClassName("android.widget.Button").click();
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
//        ок в успешно
        WebElement el23 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView\n"));
        el23.click();
    }


    @Test
    public void DBOTEST_5() throws MalformedURLException {

//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement one = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
//        one.click();
//        driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
//        WebElement el1 = driver.findElement(By.id("com.alseda.mtbyl:id/oneButton"));
//        for (int count = 0; count < 12; count++) {
//            el1.click();
//        }
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement el2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
//        el2.click();

        //        нажать +
        WebElement el3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Создать\"]/android.widget.ImageView"));
        el3.click();
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
//        выбрать платеж в бел руб
        WebElement el4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
        el4.click();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        WebElement el5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        String summa = "100";
//        ввести сумму
        el5.sendKeys(summa);
        WebElement el6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"));
        el6.click();
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
//        продолжить
        WebElement el7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]"));
        el7.click();
//        выбор плательщика
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
        WebElement el8 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el8.click();
        // click prodolzit
        driver.manage().timeouts().implicitlyWait(75000, TimeUnit.MILLISECONDS);
        WebElement prod = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"));
        prod.click();

        driver.manage().timeouts().implicitlyWait(12000, TimeUnit.MILLISECONDS);
// наименование
        WebElement el12 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el12.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        справочник
        WebElement el13 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
        el13.click();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        //   выбор в справочнике
        // выбор ккорреспондента -Atoma
        WebElement el14 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RadioButton"));
        el14.click();
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
        //свайп
        WebElement elX = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
        elX.click();


        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = driver.manage().window().getSize();
        int edgeBorder = 10;
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);

        new TouchAction(driver)
                .press(pointOptionStart)
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                .moveTo(pointOptionEnd)
                .release().perform();

//      заполняем корреспондента
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        WebElement Schet = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        Schet.click();
        String text3 = "BY31PJCB30150018431000000933";
        Schet.sendKeys(text3);

//   код банка корреспондента
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        WebElement kod = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        kod.click();

        WebElement poisk = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Поиск\"]"));
        poisk.click();
        WebElement poiskStroka = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
        String text2 = "PJCBBY2X";
        poiskStroka.sendKeys(text2);
        WebElement elB = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioButton"));
        elB.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

//           driver.findElementByClassName("android.widget.Button").click();
        WebElement prod1 = driver.findElementById("com.alseda.mtbyl:id/button");
        prod1.click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        назначение
        WebElement el15 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el15.click();
//        выбор в назначении
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement el16 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RadioButton"));
        el16.click();

//        продолжить
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElementByClassName("android.widget.Button").click();


        PointOption pointOptionStart1, pointOptionEnd1;
        pointOptionStart1 = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd1 = PointOption.point(dims.width / 2, edgeBorder);
        new TouchAction(driver)
                .press(pointOptionStart1)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                .moveTo(pointOptionEnd1)
                .release().perform();

//        выбор счета списания комиссии
        WebElement el17 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el17.click();
        WebElement el18 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el18.click();

//        создать
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.findElementByClassName("android.widget.Button").click();

//        ок в успешно
        WebElement el23 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView\n"));
        el23.click();
    }

    @Test
    public void DBOTEST_6() throws MalformedURLException {
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement one = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
//        one.click();
//        driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
//        WebElement el1 = driver.findElement(By.id("com.alseda.mtbyl:id/oneButton"));
//        for (int count = 0; count < 12; count++) {
//            el1.click();
//        }
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement el2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
//        el2.click();

        //        нажать +
        WebElement el3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Создать\"]/android.widget.ImageView"));
        el3.click();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
//        выбрать платеж в бел руб
        WebElement el4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
        el4.click();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        WebElement el5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        String summa = "100";
//        ввести сумму
        el5.sendKeys(summa);
        WebElement el6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"));
        el6.click();
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
//        продолжить
        WebElement el7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]"));
        el7.click();
//        выбор плательщика
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        WebElement el8 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el8.click();
        // click prodolzit
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
        WebElement prod = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
        prod.click();

        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
// наименование
        WebElement el12 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el12.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        справочник
        WebElement el13 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
        el13.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        //   выбор в справочнике
        // выбор ккорреспондента -Atoma
        WebElement el14 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RadioButton"));
        el14.click();

        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
        //свайп
        WebElement elX = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
        elX.click();


        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = driver.manage().window().getSize();
        int edgeBorder = 10;
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);

        new TouchAction(driver)
                .press(pointOptionStart)
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                .moveTo(pointOptionEnd)
                .release().perform();

//      заполняем корреспондента
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

        WebElement Schet = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        Schet.click();
        String text3 = "BY31PJCB30150018431000000933";
        Schet.sendKeys(text3);

//   код банка корреспондента
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
        WebElement kod = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        kod.click();

        WebElement poisk = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Поиск\"]"));
        poisk.click();
        WebElement poiskStroka = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
        String text2 = "PJCBBY2X";
        poiskStroka.sendKeys(text2);
        WebElement elB = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RadioButton"));
        elB.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

//           driver.findElementByClassName("android.widget.Button").click();
        WebElement prod1 = driver.findElementById("com.alseda.mtbyl:id/button");
        prod1.click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        назначение
        WebElement el15 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el15.click();
//        выбор в назначении
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement el16 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RadioButton"));
        el16.click();

//        продолжить
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.findElementByClassName("android.widget.Button").click();

        PointOption pointOptionStart1, pointOptionEnd1;
        pointOptionStart1 = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd1 = PointOption.point(dims.width / 2, edgeBorder);

        new TouchAction(driver)
                .press(pointOptionStart1)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                .moveTo(pointOptionEnd1)
                .release().perform();

//        выбор счета списания комиссии
        WebElement el17 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el17.click();
        WebElement el18 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        el18.click();

//        создать
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.findElementByClassName("android.widget.Button").click();

//        ок в успешно
        WebElement el23 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView\n"));
        el23.click();
    }

    @Test
    public void DBOTEST_7() throws MalformedURLException {
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement one = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
//        one.click();
//        driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
//        WebElement el1 = driver.findElement(By.id("com.alseda.mtbyl:id/oneButton"));
//        for (int count = 0; count < 12; count++) {
//            el1.click();
//        }
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement el2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
//        el2.click();
        //        нажать +
        WebElement el3 = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Создать\"]/android.widget.ImageView"));
        el3.click();
//        выбрать платеж в бел руб
        WebElement el4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
        el4.click();
        WebElement el5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        String text = "100";
//        ввести сумму
        el5.sendKeys(text);

        WebElement nds = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        String ndsText = "5";
        nds.sendKeys(ndsText);
        WebElement el6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Switch"));
        el6.click();
        WebElement el7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.Switch"));
        el7.click();

        WebElement el8 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"));
        el8.click();
        // click prodolzit
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
        WebElement prod = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
        prod.click();

        WebElement elX = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]"));
        elX.click();
//        выбор плательщика
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        WebElement elX1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton"));
        elX1.click();

        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        // click prodolzit
        WebElement prod2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
        prod2.click();
        driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
// наименование
        WebElement el12 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        el12.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        WebElement el13 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
        el13.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el14 = driver.findElementByAccessibilityId("Поиск");
        el14.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el15 = driver.findElementById("com.alseda.mtbyl:id/search_src_text");
        String Poluchatel = "Главное управление министерства финансов РБ по г.Минску";
        el15.sendKeys(Poluchatel);

        WebElement el16 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RadioButton");
        el16.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el17 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
        el17.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el18 = driver.findElementById("com.alseda.mtbyl:id/editTextIv");
        el18.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el19 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton");
        el19.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el20 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
        String dopInfo = "Testovii platezh";
        el20.sendKeys(dopInfo);
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        WebElement el21 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
        el21.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el22 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView");
        el22.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el23 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton");
        el23.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el24 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView");
        el24.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el25 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton");
        el25.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el26 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
        String YNP = "511111111";
        el26.sendKeys(YNP);

        WebElement ex = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
        ex.click();

        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        int edgeBorder = 10;
        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = driver.manage().window().getSize();
        PointOption pointOptionStart1, pointOptionEnd1;
        pointOptionStart1 = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd1 = PointOption.point(dims.width / 2, edgeBorder);

        new TouchAction(driver)
                .press(pointOptionStart1)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                .moveTo(pointOptionEnd1)
                .release().perform();

        WebElement el27 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
        el27.sendKeys(dopInfo);
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

        WebElement el28 = driver.findElementById("com.alseda.mtbyl:id/editTextIv");
        el28.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el29 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RadioButton");
        el29.click();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el30 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
        String organ = "Test";
        el30.sendKeys(organ);
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        WebElement el31 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
        el31.sendKeys(YNP);
        WebElement el32 = driver.findElementById("com.alseda.mtbyl:id/button");
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        el32.click();
        WebElement el33 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView\n"));
        el33.click();

    }

    @Test
    public void DBOTEST_8() throws MalformedURLException {

//                driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement one = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
//        one.click();
//        driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
//        WebElement el1 = driver.findElement(By.id("com.alseda.mtbyl:id/oneButton"));
//        for (int count = 0; count < 12; count++) {
//            el1.click();
//        }
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        WebElement el2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]"));
//        el2.click();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = driver.manage().window().getSize();
        int edgeBorder = 10;
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);

        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): FAILED" + e.getMessage());
            return;
        }

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        WebElement element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"));

//        длинное нажатие
        new Actions(driver).clickAndHold(element).perform();

        WebElement delete = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView"));
        delete.click();

        WebElement deleteButtone = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]"));
        deleteButtone.click();
    }
}