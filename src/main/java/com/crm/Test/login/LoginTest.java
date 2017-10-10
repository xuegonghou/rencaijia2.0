package com.crm.Test.login;

import com.crm.Test.Mydp;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * 登录测试
 */
public class LoginTest {
    private WebDriver driver;
    private String baseUrl;
    private  int   amount=0;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Ddrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();// 浏览器最大化
        driver.get("http://192.168.1.170:8890/login");
    }

    @Test
    public void main() throws InterruptedException {
        Mydp mydp=new Mydp();
        List xx=mydp.dp();
        for(Object attribute : xx) {
            String usernamepassword= (String) attribute;
            String username = usernamepassword.split(",")[0];
            String password = usernamepassword.split(",")[1];
//            System.out.println("用户名: "+username);
//            System.out.println("密码: "+password);

            driver.findElement(By.name("username")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.cssSelector(".input.login-btn.rcj-btn")).click();
            Thread.sleep(200);
            try{
                String tip=driver.findElement(By.cssSelector(".el-menu-item.is-active>a")).getText();
                System.out.println("登录成功   输入用户名: "+username+" 输入密码为: "+password);
                //执行浏览器后退
                driver.navigate().back();
                Thread.sleep(51);
            }catch (Exception e){
                //ctrl+a 全选输入框内容
                driver.findElement(By.name("username")).sendKeys(Keys.CONTROL,"a");
                driver.findElement(By.name("username")).sendKeys(Keys.BACK_SPACE);
                driver.findElement(By.name("password")).sendKeys(Keys.CONTROL,"a");
                driver.findElement(By.name("password")).sendKeys(Keys.BACK_SPACE);
                System.err.println("用户名或密码错误!! 输入的用户名: "+username+"  输入密码: "+password);
            }
        }
        System.out.println("测试完毕，测试通过!!");
    }
}
