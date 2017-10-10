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

public class CreatepositionTest01 {
private WebDriver driver;
private String baseUrl;
private int count=0;
private int type=0;
private int age=0;
private int sex=0;
private int year=0;
private int salary,salary2=0;
String jobresponsibilities="1、审批财务收支，审阅财务专题报告和会计报表，对重大的财务收支计划、经济合同进行会签；\n" +
        "2、编制预算和执行预算，参与拟订资金筹措和使用方案，确保资金的有效使用；\n" +
        "3、审查公司对外提供的会计资料；\n" +
        "4、负责审核公司本部和各下属单位上报的会计报表和集团公司会计报表，编制财务综合分析报告和专题分析报告；\n" +
        "5、制订公司内部财务、会计制度和工作程序，经批准后组织实施并监督执行；\n" +
        "6、组织编制与实现公司的财务收支计划、信贷计划与成本费用计划。";


@Before
public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Ddrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();// 浏览器最大化
        baseUrl = "http://192.168.1.170/login/dev/";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //企业登录
        driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div[2]")).click();
        driver.findElement(By.name("username")).sendKeys("qiye52");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.cssSelector(".login-btn")).click();
}
@Test
public void mainposition() throws Exception {

        for (int i = 0; i <19 ; i++) {
                count++;
                type++;
                age++;
                sex++;
                salary++;
                salary2++;
                year++;
                position();
        }
        for (int i = 0; i <15 ; i++) {
                count++;
                type++;
                age++;
                sex++;
                salary++;
                salary2++;
                year++;
                position2();
        }
        for (int i = 0; i <11 ; i++) {
                count++;
                type++;
                age++;
                sex++;
                salary++;
                salary2++;
                year++;
                position3();
        }
        for (int i = 0; i <12 ; i++) {
                count++;
                type++;
                age++;
                sex++;
                salary++;
                salary2++;
                year++;
                position4();
        }
        for (int i = 0; i <31 ; i++) {
                count++;
                type++;
                age++;
                sex++;
                salary++;
                salary2++;
                year++;
                position5();
        }
        for (int i = 0; i <31 ; i++) {
                count++;
                type++;
                age++;
                sex++;
                salary++;
                salary2++;
                year++;
                position6();
        }
        for (int i = 0; i <15 ; i++) {
                count++;
                type++;
                age++;
                sex++;
                salary++;
                salary2++;
                year++;
                position7();
        }
        for (int i = 0; i <6 ; i++) {
                count++;
                type++;
                age++;
                sex++;
                salary++;
                salary2++;
                year++;
                position8();
        }

}

public void position() throws Exception {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[7]/a["+count+"]")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".confirm")).click();
        //-------------------工作类型项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/div")).click();
        //选择具体工作类型
        if (type<=3){
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/ul/li["+type+"]")).click();
        }else {type=0;}
        //--------------------学历要求项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/div")).click();
        //选择具体学历
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/ul/li[4]")).click();
        //选择统招
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/label/span")).click();
        //-------------------工作年限项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/div")).click();
        //选择具体工作年限
        if (year<=8){
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/ul/li["+year+"]")).click();
        }
        //-------------------薪资待遇项----------------------------------
        if (type==1&&salary<35){
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
        Thread.sleep(101);
        //选择左边框
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
        //................................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
        Thread.sleep(100);
        //选择右边框
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        }else if(type==2&&salary2<6){
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
        //选择具体薪资范围
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li["+salary2+"]")).click();
        }else if (type==3&&salary<35){
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
        Thread.sleep(101);
        //选择左边框
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
        //................................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
        Thread.sleep(100);
        //选择右边框
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        type=0;
        }else {
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
        Thread.sleep(100);
        //选择左边框
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[3]")).click();
        //................................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
        Thread.sleep(101);
        //选择右边框
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[7]")).click();
        }

        //---------------------年龄要求项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/div")).click();
        //选择具体左边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/ul/li["+age+"]")).click();
        //...............................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/div")).click();
        //选择具体右边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/ul/li[1]")).click();
        //---------------------专业要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[7]/div/div/div/input[1]")).click();
        //选择具体的语言
        int k=0;
        for (int i = 0; i <5 ; i++) {
        k++;
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/a["+k+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //----------------------语言要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[8]/div/div/div/div[1]/div/input[1]")).click();
        //选择具体的语言
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[4]/a[1]")).click();
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-----------------------执业证书项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[9]/div/div[1]/input")).click();
        //选择具体证书
        int k2=0;
        for (int i = 0; i <5 ; i++) {
        k2++;
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[4]/a["+k2+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-------------------------身高要求项---------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[10]/div/div/div/input")).sendKeys("165");
        //-------------------------性别要求-----------------------------------
        //选择具体性别
        if (sex<=3){
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/div")).click();
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/ul/li["+sex+"]")).click();
        }else if(sex>4){sex=0;}
        //--------------------------职位描述---------------------------------
        driver.findElement(By.xpath(".//*[@id='Responsibilities']")).sendKeys(jobresponsibilities);
        //--------------------------公司福利项---------------------------------
        driver.findElement(By.linkText("五险一金")).click();
        driver.findElement(By.linkText("交通补助")).click();
        driver.findElement(By.linkText("年底双薪")).click();
        driver.findElement(By.linkText("带薪年假")).click();
        //------------------------------发布-------------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[17]/div/a[1]")).click();
        //继续下一个职位发布
        driver.findElement(By.linkText("企业中心")).click();

}
public void position2() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[2]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[7]/a["+count+"]")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".confirm")).click();
        //-------------------工作类型项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/div")).click();
        //选择具体工作类型
        if (type<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/ul/li["+type+"]")).click();
        }else {type=0;}
        //--------------------学历要求项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/div")).click();
        //选择具体学历
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/ul/li[4]")).click();
        //选择统招
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/label/span")).click();
        //-------------------工作年限项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/div")).click();
        //选择具体工作年限
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/ul/li[7]")).click();
        //-------------------薪资待遇项----------------------------------
        if (type==1&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        }else if(type==2&&salary2<6){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
                //选择具体薪资范围
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li["+salary2+"]")).click();
        }else if (type==3&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
                type=0;
        }else {
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[3]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(100);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[7]")).click();
        }


        //---------------------年龄要求项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/div")).click();
        //选择具体左边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/ul/li["+age+"]")).click();
        //...............................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/div")).click();
        //选择具体右边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/ul/li[1]")).click();
        //---------------------专业要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[7]/div/div/div/input[1]")).click();
        //选择具体的语言
        int k=0;
        for (int i = 0; i <5 ; i++) {
                k++;
                driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/a["+k+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //----------------------语言要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[8]/div/div/div/div[1]/div/input[1]")).click();
        //选择具体的语言
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[4]/a[1]")).click();
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-----------------------执业证书项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[9]/div/div[1]/input")).click();
        //选择具体证书
        int k2=0;
        for (int i = 0; i <5 ; i++) {
                k2++;
                driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[4]/a["+k2+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-------------------------身高要求项---------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[10]/div/div/div/input")).sendKeys("165");
        //-------------------------性别要求-----------------------------------
        //选择具体性别
        if (sex<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/div")).click();
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/ul/li["+sex+"]")).click();
        }else if(sex>4){sex=0;}
        //--------------------------职位描述-----------------------------------
        driver.findElement(By.xpath(".//*[@id='Responsibilities']")).sendKeys(jobresponsibilities);
        //--------------------------公司福利项---------------------------------
        driver.findElement(By.linkText("五险一金")).click();
        driver.findElement(By.linkText("交通补助")).click();
        driver.findElement(By.linkText("年底双薪")).click();
        driver.findElement(By.linkText("带薪年假")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".sure-btn")).click();
        //------------------------------发布-------------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[18]/div/a[1]")).click();
        //继续下一个职位发布
        driver.findElement(By.linkText("企业中心")).click();
}
public void position3() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[7]/a["+count+"]")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".confirm")).click();
        //-------------------工作类型项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/div")).click();
        //选择具体工作类型
        if (type<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/ul/li["+type+"]")).click();
        }else {type=0;}
        //--------------------学历要求项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/div")).click();
        //选择具体学历
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/ul/li[4]")).click();
        //选择统招
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/label/span")).click();
        //-------------------工作年限项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/div")).click();
        //选择具体工作年限
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/ul/li[7]")).click();
        //-------------------薪资待遇项----------------------------------
        if (type==1&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(100);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        }else if(type==2&&salary2<6){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
                //选择具体薪资范围
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li["+salary2+"]")).click();
        }else if (type==3&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
                type=0;
        }else {
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[3]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(100);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[7]")).click();
        }


        //---------------------年龄要求项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/div")).click();
        //选择具体左边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/ul/li["+age+"]")).click();
        //...............................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/div")).click();
        //选择具体右边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/ul/li[1]")).click();
        //---------------------专业要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[7]/div/div/div/input[1]")).click();
        //选择具体的语言
        int k=0;
        for (int i = 0; i <5 ; i++) {
                k++;
                driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/a["+k+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //----------------------语言要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[8]/div/div/div/div[1]/div/input[1]")).click();
        //选择具体的语言
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[4]/a[1]")).click();
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-----------------------执业证书项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[9]/div/div[1]/input")).click();
        //选择具体证书
        int k2=0;
        for (int i = 0; i <5 ; i++) {
                k2++;
                driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[4]/a["+k2+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-------------------------身高要求项---------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[10]/div/div/div/input")).sendKeys("165");
        //-------------------------性别要求-----------------------------------
        //选择具体性别
        if (sex<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/div")).click();
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/ul/li["+sex+"]")).click();
        }else if(sex>4){sex=0;}

        //--------------------------岗位职责项---------------------------------
//        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
//        //--------------------------任职要求项---------------------------------
//        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
        //--------------------------公司福利项---------------------------------
        driver.findElement(By.linkText("五险一金")).click();
        driver.findElement(By.linkText("交通补助")).click();
        driver.findElement(By.linkText("年底双薪")).click();
        driver.findElement(By.linkText("带薪年假")).click();
        driver.findElement(By.linkText("自定义")).click();
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[14]/div/div/div/div/div/div/div/div/div/input")).sendKeys("周末双休");
        //确定按钮
        driver.findElement(By.cssSelector(".sure-btn")).click();
        //------------------------------发布-------------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[18]/div/a[1]")).click();
        //继续下一个职位发布
        driver.findElement(By.linkText("企业中心")).click();

}
public void position4() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[4]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[7]/a["+count+"]")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".confirm")).click();
        //-------------------工作类型项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/div")).click();
        //选择具体工作类型
        if (type<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/ul/li["+type+"]")).click();
        }else {type=0;}
        //--------------------学历要求项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/div")).click();
        //选择具体学历
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/ul/li[4]")).click();
        //选择统招
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/label/span")).click();
        //-------------------工作年限项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/div")).click();
        //选择具体工作年限
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/ul/li[7]")).click();
        //-------------------薪资待遇项----------------------------------
        if (type==1&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(100);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        }else if(type==2&&salary2<6){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
                //选择具体薪资范围
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li["+salary2+"]")).click();
        }else if (type==3&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
                type=0;
        }else {
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[3]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[7]")).click();
        }


        //---------------------年龄要求项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/div")).click();
        //选择具体左边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/ul/li["+age+"]")).click();
        //...............................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/div")).click();
        //选择具体右边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/ul/li[1]")).click();
        //---------------------专业要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[7]/div/div/div/input[1]")).click();
        //选择具体的语言
        int k=0;
        for (int i = 0; i <5 ; i++) {
                k++;
                driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/a["+k+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //----------------------语言要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[8]/div/div/div/div[1]/div/input[1]")).click();
        //选择具体的语言
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[4]/a[1]")).click();
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-----------------------执业证书项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[9]/div/div[1]/input")).click();
        //选择具体证书
        int k2=0;
        for (int i = 0; i <5 ; i++) {
                k2++;
                driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[4]/a["+k2+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-------------------------身高要求项---------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[10]/div/div/div/input")).sendKeys("165");
        //-------------------------性别要求-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/div")).click();
        //选择具体性别

        if (sex<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/ul/li["+sex+"]")).click();
        }else if(sex>3){sex=0;}

        //--------------------------岗位职责项---------------------------------
//        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
//        //--------------------------任职要求项---------------------------------
//        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
        //--------------------------公司福利项---------------------------------
        driver.findElement(By.linkText("五险一金")).click();
        driver.findElement(By.linkText("交通补助")).click();
        driver.findElement(By.linkText("年底双薪")).click();
        driver.findElement(By.linkText("带薪年假")).click();
        driver.findElement(By.linkText("自定义")).click();
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[14]/div/div/div/div/div/div/div/div/div/input")).sendKeys("周末双休");
        //确定按钮
        driver.findElement(By.cssSelector(".sure-btn")).click();
        //------------------------------发布-------------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[18]/div/a[1]")).click();
        //继续下一个职位发布
        driver.findElement(By.linkText("企业中心")).click();

}
public void position5() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[5]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[7]/a["+count+"]")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".confirm")).click();
        //-------------------工作类型项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/div")).click();
        //选择具体工作类型
        if (type<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/ul/li["+type+"]")).click();
        }else {type=0;}
        //--------------------学历要求项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/div")).click();
        //选择具体学历
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/ul/li[4]")).click();
        //选择统招
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/label/span")).click();
        //-------------------工作年限项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/div")).click();
        //选择具体工作年限
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/ul/li[7]")).click();
        //-------------------薪资待遇项----------------------------------
        if (type==1&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(100);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        }else if(type==2&&salary2<6){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
                //选择具体薪资范围
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li["+salary2+"]")).click();
        }else if (type==3&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
                type=0;
        }else {
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[3]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[7]")).click();
        }


        //---------------------年龄要求项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/div")).click();
        //选择具体左边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/ul/li["+age+"]")).click();
        //...............................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/div")).click();
        //选择具体右边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/ul/li[1]")).click();
        //---------------------专业要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[7]/div/div/div/input[1]")).click();
        //选择具体的语言
        int k=0;
        for (int i = 0; i <5 ; i++) {
                k++;
                driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/a["+k+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //----------------------语言要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[8]/div/div/div/div[1]/div/input[1]")).click();
        //选择具体的语言
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[4]/a[1]")).click();
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-----------------------执业证书项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[9]/div/div[1]/input")).click();
        //选择具体证书
        int k2=0;
        for (int i = 0; i <5 ; i++) {
                k2++;
                driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[4]/a["+k2+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-------------------------身高要求项---------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[10]/div/div/div/input")).sendKeys("165");
        //-------------------------性别要求-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/div")).click();
        //选择具体性别

        if (sex<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/ul/li["+sex+"]")).click();
        }else if(sex>3){sex=0;}

        //--------------------------岗位职责项---------------------------------
//        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
//        //--------------------------任职要求项---------------------------------
//        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
        //--------------------------公司福利项---------------------------------
        driver.findElement(By.linkText("五险一金")).click();
        driver.findElement(By.linkText("交通补助")).click();
        driver.findElement(By.linkText("年底双薪")).click();
        driver.findElement(By.linkText("带薪年假")).click();
        driver.findElement(By.linkText("自定义")).click();
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[14]/div/div/div/div/div/div/div/div/div/input")).sendKeys("周末双休");
        //确定按钮
        driver.findElement(By.cssSelector(".sure-btn")).click();
        //------------------------------发布-------------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[18]/div/a[1]")).click();
        //继续下一个职位发布
        driver.findElement(By.linkText("企业中心")).click();

}
public void position6() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[6]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[7]/a["+count+"]")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".confirm")).click();
        //-------------------工作类型项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/div")).click();
        //选择具体工作类型
        if (type<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/ul/li["+type+"]")).click();
        }else {type=0;}
        //--------------------学历要求项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/div")).click();
        //选择具体学历
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/ul/li[4]")).click();
        //选择统招
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/label/span")).click();
        //-------------------工作年限项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/div")).click();
        //选择具体工作年限
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/ul/li[7]")).click();
        //-------------------薪资待遇项----------------------------------
        if (type==1&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(100);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        }else if(type==2&&salary2<6){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
                //选择具体薪资范围
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li["+salary2+"]")).click();
        }else if (type==3&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
                type=0;
        }else {
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[3]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[7]")).click();
        }


        //---------------------年龄要求项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/div")).click();
        //选择具体左边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/ul/li["+age+"]")).click();
        //...............................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/div")).click();
        //选择具体右边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/ul/li[1]")).click();
        //---------------------专业要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[7]/div/div/div/input[1]")).click();
        //选择具体的语言
        int k=0;
        for (int i = 0; i <5 ; i++) {
                k++;
                driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/a["+k+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //----------------------语言要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[8]/div/div/div/div[1]/div/input[1]")).click();
        //选择具体的语言
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[4]/a[1]")).click();
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-----------------------执业证书项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[9]/div/div[1]/input")).click();
        //选择具体证书
        int k2=0;
        for (int i = 0; i <5 ; i++) {
                k2++;
                driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[4]/a["+k2+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-------------------------身高要求项---------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[10]/div/div/div/input")).sendKeys("165");
        //-------------------------性别要求-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/div")).click();
        //选择具体性别

        if (sex<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/ul/li["+sex+"]")).click();
        }else if(sex>3){sex=0;}

        //--------------------------岗位职责项---------------------------------
//        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
//        //--------------------------任职要求项---------------------------------
//        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
        //--------------------------公司福利项---------------------------------
        driver.findElement(By.linkText("五险一金")).click();
        driver.findElement(By.linkText("交通补助")).click();
        driver.findElement(By.linkText("年底双薪")).click();
        driver.findElement(By.linkText("带薪年假")).click();
        driver.findElement(By.linkText("自定义")).click();
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[14]/div/div/div/div/div/div/div/div/div/input")).sendKeys("周末双休");
        //确定按钮
        driver.findElement(By.cssSelector(".sure-btn")).click();
        //------------------------------发布-------------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[18]/div/a[1]")).click();
        //继续下一个职位发布
        driver.findElement(By.linkText("企业中心")).click();

}
public void position7() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[8]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[9]/a["+count+"]")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".confirm")).click();
        //-------------------工作类型项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/div")).click();
        //选择具体工作类型
        if (type<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/ul/li["+type+"]")).click();
        }else {type=0;}
        //--------------------学历要求项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/div")).click();
        //选择具体学历
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/ul/li[4]")).click();
        //选择统招
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/label/span")).click();
        //-------------------工作年限项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/div")).click();
        //选择具体工作年限
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/ul/li[7]")).click();
        //-------------------薪资待遇项----------------------------------
        if (type==1&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(100);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        }else if(type==2&&salary2<6){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
                //选择具体薪资范围
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li["+salary2+"]")).click();
        }else if (type==3&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
                type=0;
        }else {
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[3]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[7]")).click();
        }


        //---------------------年龄要求项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/div")).click();
        //选择具体左边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/ul/li["+age+"]")).click();
        //...............................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/div")).click();
        //选择具体右边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/ul/li[1]")).click();
        //---------------------专业要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[7]/div/div/div/input[1]")).click();
        //选择具体的语言
        int k=0;
        for (int i = 0; i <5 ; i++) {
                k++;
                driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/a["+k+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //----------------------语言要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[8]/div/div/div/div[1]/div/input[1]")).click();
        //选择具体的语言
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[4]/a[1]")).click();
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-----------------------执业证书项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[9]/div/div[1]/input")).click();
        //选择具体证书
        int k2=0;
        for (int i = 0; i <5 ; i++) {
                k2++;
                driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[4]/a["+k2+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-------------------------身高要求项---------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[10]/div/div/div/input")).sendKeys("165");
        //-------------------------性别要求-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/div")).click();
        //选择具体性别

        if (sex<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/ul/li["+sex+"]")).click();
        }else if(sex>3){sex=0;}

        //--------------------------岗位职责项---------------------------------
//        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
//        //--------------------------任职要求项---------------------------------
//        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
        //--------------------------公司福利项---------------------------------
        driver.findElement(By.linkText("五险一金")).click();
        driver.findElement(By.linkText("交通补助")).click();
        driver.findElement(By.linkText("年底双薪")).click();
        driver.findElement(By.linkText("带薪年假")).click();
        driver.findElement(By.linkText("自定义")).click();
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[14]/div/div/div/div/div/div/div/div/div/input")).sendKeys("周末双休");
        //确定按钮
        driver.findElement(By.cssSelector(".sure-btn")).click();
        //------------------------------发布-------------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[18]/div/a[1]")).click();
        //继续下一个职位发布
        driver.findElement(By.linkText("企业中心")).click();
}
public void position8() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[9]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[9]/a["+count+"]")).click();
        //确定按钮
        driver.findElement(By.cssSelector(".confirm")).click();
        //-------------------工作类型项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/div")).click();
        //选择具体工作类型
        if (type<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[2]/div/div/div/ul/li["+type+"]")).click();
        }else {type=0;}
        //--------------------学历要求项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/div")).click();
        //选择具体学历
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/div/ul/li[4]")).click();
        //选择统招
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[3]/div/div/div/label/span")).click();
        //-------------------工作年限项--------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/div")).click();
        //选择具体工作年限
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[4]/div/div/div/ul/li[7]")).click();
        //-------------------薪资待遇项----------------------------------
        if (type==1&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(100);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(100);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
        }else if(type==2&&salary2<6){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
                //选择具体薪资范围
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li["+salary2+"]")).click();
        }else if (type==3&&salary<35){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li["+salary+"]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[1]")).click();
                type=0;
        }else {
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
                Thread.sleep(101);
                //选择左边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[3]")).click();
                //................................................................
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
                Thread.sleep(101);
                //选择右边框
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[7]")).click();
        }


        //---------------------年龄要求项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/div")).click();
        //选择具体左边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[1]/ul/li["+age+"]")).click();
        //...............................................................
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/div")).click();
        //选择具体右边年龄
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[6]/div/div/div/div[2]/ul/li[1]")).click();
        //---------------------专业要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[7]/div/div/div/input[1]")).click();
        //选择具体的语言
        int k=0;
        for (int i = 0; i <5 ; i++) {
                k++;
                driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/a["+k+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='MajorsSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //----------------------语言要求项-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[8]/div/div/div/div[1]/div/input[1]")).click();
        //选择具体的语言
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[4]/a[1]")).click();
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='LanguageMask']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-----------------------执业证书项----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[9]/div/div[1]/input")).click();
        //选择具体证书
        int k2=0;
        for (int i = 0; i <5 ; i++) {
                k2++;
                driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[4]/a["+k2+"]")).click();
        }
        //确定按钮
        driver.findElement(By.xpath(".//*[@id='certificateSelect']/div/div/div[2]/div/div[5]/a[1]")).click();
        //-------------------------身高要求项---------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[10]/div/div/div/input")).sendKeys("165");
        //-------------------------性别要求-----------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/div")).click();
        //选择具体性别

        if (sex<=3){
                driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[11]/div/div/div/ul/li["+sex+"]")).click();
        }else if(sex>3){sex=0;}

        //--------------------------岗位职责项---------------------------------
//        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
//        //--------------------------任职要求项---------------------------------
//        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
        //--------------------------公司福利项---------------------------------
        driver.findElement(By.linkText("五险一金")).click();
        driver.findElement(By.linkText("交通补助")).click();
        driver.findElement(By.linkText("年底双薪")).click();
        driver.findElement(By.linkText("带薪年假")).click();
        driver.findElement(By.linkText("自定义")).click();
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[14]/div/div/div/div/div/div/div/div/div/input")).sendKeys("周末双休");
        //确定按钮
        driver.findElement(By.cssSelector(".sure-btn")).click();
        //------------------------------发布-------------------------------------
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[18]/div/a[1]")).click();
        //继续下一个职位发布
        driver.findElement(By.linkText("企业中心")).click();
}
@After
public void tearDown() throws Exception {
       //driver.quit();

}
}
