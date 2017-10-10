package com.crm.Test.Other;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Jobmarketearch {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    public int cout=1;
    public int ww=0;
    public String aa="";
    public String position="";
    public String text="";//这个是输入要查询的职位


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Ddrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();// 浏览器最大化
        baseUrl = "http://192.168.1.170/login/dev/";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(29, TimeUnit.SECONDS);
        //人才登录
        driver.findElement(By.linkText("职位")).click();
        driver.findElement(By.linkText("职位")).click();
        driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[1]/a")).click();
        driver.close();

    }

    @Test
    public void cancelpublication() throws Exception {
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        WebElement search=driver.findElement(By.cssSelector(".search-box>input"));
        search.sendKeys(text);
        Thread.sleep(100);
        driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/a")).click();
         search();

    }
    public void search(){
        for (int i = 0; i < 10; i++) {
            ww++;
             position=driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div[1]/div["+ww+"]/div[1]/div/a")).getText();
            if (text.equals(position)){
                String ym=driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div[1]/div[11]/div/span")).getText();
                String xx = StringUtils.substringBefore(ym, "页");
                String kk3 = StringUtils.substringAfterLast(xx, "共");
                System.err.println("-----------------"+position+"--------------------"+aa+"页");
                txt();
            }else if (position.equals("")){
                System.err.println("-----------------"+position+"--------------------"+aa+"页");
            }else {
                System.out.println("..............."+position+"............");
            }
        }
        cout++;
        nextpage();
    }
    public void nextpage(){
        WebElement wb=driver.findElement(By.cssSelector(".font-enter>input"));
         aa= String.valueOf(cout);
        wb.clear();
        wb.sendKeys(aa);
        driver.findElement(By.cssSelector(".enter-button")).click();
        ww=0;
        search();

    }
    public void txt() {

        FileWriter fw = null;
        try {
            //如果文件存在，则追加内容；如果文件不存在，则创建文件
            File f = new File("D:\\工作经验10年以上测试.txt");
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.println(position);
        pw.println("");
        pw.flush();
        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {

        }
    }
    @After
    public void tearDown() throws Exception {
//        driver.close();
//        driver.quit();

    }
}