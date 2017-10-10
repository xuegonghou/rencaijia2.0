package com.crm.Test.position;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Restorepublication {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Ddrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();// 浏览器最大化
        baseUrl = "http://192.168.1.170/login/dev/";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(29, TimeUnit.SECONDS);
        //企业登录
        driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div[2]")).click();
        driver.findElement(By.name("username")).sendKeys("qiye52");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.cssSelector(".login-btn")).click();
    }

    @Test
    public void cancelpublication() throws Exception {
        driver.findElement(By.linkText("职位管理")).click();
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='unpublished']")).click();
        try {
            while (true){
                //点击发布职位按钮
                Thread.sleep(200);
                driver.findElement(By.xpath(".//*[@id='position-container']/div/div[3]/div[1]/div/div")).click();
                Thread.sleep(200);
                driver.switchTo().alert().accept();
                Thread.sleep(1000);
            }
        }catch (Exception e){
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
        driver.quit();

    }
}