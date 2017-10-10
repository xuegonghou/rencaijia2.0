package com.crm.Test.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 * 登录测试
 */
public class Login {
    String txt=null;
    private WebDriver driver;
    private String baseUrl;
    private int amount = 0;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Ddrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();// 浏览器最大化
        driver.get("http://192.168.1.170:8890/login");
    }
//查询所有
    @Test
    public void test() throws Exception {

        Data data = new Data();
        List list= data.getAll();
        for (Object attribute : list) {
            String usernamepassword = (String) attribute;
            String username = usernamepassword.split(",")[0];
            String password = usernamepassword.split(",")[1];
            driver.findElement(By.name("username")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.cssSelector(".input.login-btn.rcj-btn")).click();
            Thread.sleep(200);
            try {
                String tip = driver.findElement(By.cssSelector(".el-menu-item.is-active>a")).getText();
                System.out.println("登录成功!   输入用户名: " + username + " 输入密码为: " + password);
                txt="登录成功!   输入用户名: " + username + " 输入密码为: " + password;
                txt();
                //执行浏览器后退
                driver.navigate().back();
                Thread.sleep(51);
            } catch (Exception e) {
                //ctrl+a 全选输入框内容
                driver.findElement(By.name("username")).sendKeys(Keys.CONTROL, "a");
                driver.findElement(By.name("username")).sendKeys(Keys.BACK_SPACE);
                driver.findElement(By.name("password")).sendKeys(Keys.CONTROL, "a");
                driver.findElement(By.name("password")).sendKeys(Keys.BACK_SPACE);
                System.err.println("用户名或密码错误!!! 输入的用户名: " + username + "  输入密码: " + password);
                txt="用户名或密码错误、 输入的用户名: " + username + "  输入密码: " + password;
                txt();
            }
        }
    }
    //添加
    @Test
    public void insert(){
     Data data=new Data();
        User user=new User("110","110");
        data.insert(user);
    }


    //打印日志到txt文本
    public void txt() {

        FileWriter fw = null;
        try {
            //如果文件存在，则追加内容；如果文件不存在，则创建文件
            File f = new File("D:\\登录测试打印.txt");
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.println(txt);
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
        driver.close();
        driver.quit();
    }
}
