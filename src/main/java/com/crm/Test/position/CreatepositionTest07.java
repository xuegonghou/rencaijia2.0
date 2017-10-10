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

public class CreatepositionTest07 {
    private WebDriver driver;
    private String baseUrl;
    private int count=0;
    private int type=0;
    private int age=0;
    private int sex=0;
    String jobresponsibilities="【职位描述】\n" +
            "\n" +
            "1.熟练掌握公司产品知识及销售流程（电话沟通+会议营销+网络销售）；\n" +
            "\n" +
            "2.公司提供客户资源，通过销售平台推动客户成交，以及维护、巩固、拓展老客户；\n" +
            "\n" +
            "3.根据公司要求完成销售目标，达成每日、每周、每月的各项关键绩效指标；\n" +
            "\n" +
            "4.通过不断学习，提升自身专业水平和营销能力。\n" +
            "\n"
            ;
    String jobrequirements="【岗位要求】\n" +
            "\n" +
            "我们对工作经验不限，欢迎不怕艰苦，勇于挑战，愿意与我们一起成长的大学生实习生加入！\n" +
            "\n" +
            "我们希望，您可以思考以下问题：\n" +
            "\n" +
            "1.自己是否对电子商务、快印图文、广告传媒行业感兴趣？\n" +
            "\n" +
            "2.对自己性格作出评估：积极、乐观、自信、有一定的抗压能力，勇于挑战高薪？\n" +
            "\n" +
            "3.对自己的态度作出分析：工作有激情，有上进心、事业心的优先？    \n" +
            "\n" +
            "4.对自己的定位作出决定：亲和力强，有良好的沟通及协调能力，吃苦耐劳？\n" +
            "\n" +
            "\n" +
            "如果您肯定，您满足自己其中的一项或者多项，那么我们真诚的邀请您！\n" +
            "\n" +
            "\n" +
            "【基础福利】\n" +
            "\n" +
            "1. 养老、医疗、失业、工伤、生育五项社会保险；\n" +
            "\n" +
            "2. 住房公积金、体检；\n" +
            "\n" +
            "3. 年底双薪、年终奖、年中年底特别奖励，节假日福利；\n" +
            "\n" +
            "4. 年假、婚假、产假、丧假均为带薪假；\n" +
            "\n" +
            "5. 薪资：无责任底薪4k+提成+奖金；\n" +
            "\n" +
            "6.培训：公司以内部培养人才为主，工作期间不定时提供提高培训，为员工提供广泛的培训、广阔的职业发展空间和可持续发展的事业。";

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
        driver.findElement(By.name("username")).sendKeys("GSGSGS100");
        driver.findElement(By.name("password")).sendKeys("88888888");
        driver.findElement(By.cssSelector(".login-btn")).click();
    }
    @Test
    public void mainposition() throws Exception {

        for (int i = 0; i <20 ; i++) {
            count++;
            type++;
            age++;
            sex++;
            position();
        }
        for (int i = 0; i <24 ; i++) {
            count++;
            type++;
            age++;
            sex++;
            position2();
        }
        for (int i = 0; i <31 ; i++) {
            count++;
            type++;
            age++;
            sex++;
            position3();
        }
//        for (int i = 0; i <7 ; i++) {
//            count++;
//            type++;
//            age++;
//            sex++;
//            position4();
//        }
//        for (int i = 0; i <20 ; i++) {
//            count++;
//            type++;
//            age++;
//            sex++;
//            position5();
//        }
//        for (int i = 0; i <8 ; i++) {
//            count++;
//            type++;
//            age++;
//            sex++;
//            position6();
//        }
//        for (int i = 0; i <14 ; i++) {
//            count++;
//            type++;
//            age++;
//            sex++;
//            position7();
//        }
//        for (int i = 0; i <6 ; i++) {
//            count++;
//            type++;
//            age++;
//            sex++;
//            position8();
//        }

    }

    public void position() throws Exception {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        //选择第七列表
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[3]/div[7]/a")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[4]/a["+count+"]")).click();
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
        if (type==1){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(100);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
        }else if(type==2){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
            //选择具体薪资范围
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li[4]")).click();
        }else if (type==3){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(101);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(101);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
            type=0;
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
        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
        //--------------------------任职要求项---------------------------------
        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
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
    public void position2() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        //选择第七列表
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[3]/div[7]/a")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[2]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[4]/a["+count+"]")).click();
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
        if (type==1){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(100);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(101);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
        }else if(type==2){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
            //选择具体薪资范围
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li[4]")).click();
        }else if (type==3){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(101);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
            type=0;
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
        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
        //--------------------------任职要求项---------------------------------
        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
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
    public void position3() throws InterruptedException {
        driver.findElement(By.linkText("发布职位")).click();
        driver.close();
        //-----------------------------选择职位名项---------------------------------
        Set<String> winHandels12 = driver.getWindowHandles(); // 得到当前窗口的set集合
        List<String> it= new ArrayList<String>(winHandels12); // 将set集合存入list对象
        driver.switchTo().window(it.get(0)); // 切换到弹出的新窗口
        driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[1]/div/div/div/input[1]")).click();
        //选择第七列表
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[3]/div[7]/a")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[3]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[4]/a["+count+"]")).click();
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
        if (type==1){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(101);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(101);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
        }else if(type==2){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
            //选择具体薪资范围
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li[4]")).click();
        }else if (type==3){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(100);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(101);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
            type=0;
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
        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
        //--------------------------任职要求项---------------------------------
        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
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
        //选择第六列
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[3]/div[6]/a")).click();
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[4]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[5]/a["+count+"]")).click();
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
        if (type==1){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(101);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
        }else if(type==2){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
            //选择具体薪资范围
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li[4]")).click();
        }else if (type==3){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(102);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
            type=0;
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
        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
        //--------------------------任职要求项---------------------------------
        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
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
        //选择第四列
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[3]/div[4]/a")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[6]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[8]/a["+count+"]")).click();
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
        if (type==1){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(101);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
        }else if(type==2){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
            //选择具体薪资范围
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li[4]")).click();
        }else if (type==3){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(102);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
            type=0;
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
        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
        //--------------------------任职要求项---------------------------------
        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
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
        //选择第四列
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[3]/div[4]/a")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[7]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[8]/a["+count+"]")).click();
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
        if (type==1){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(101);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
        }else if(type==2){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
            //选择具体薪资范围
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li[4]")).click();
        }else if (type==3){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(102);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
            type=0;
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
        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
        //--------------------------任职要求项---------------------------------
        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
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
        //选择第四列
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[3]/div[4]/a")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[8]/span")).click();
        //选择具体职位名称
        driver.findElement(By.xpath(".//*[@id='positionSelect']/div/div/div[2]/div/div[4]/div[2]/div[8]/a["+count+"]")).click();
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
        if (type==1){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(101);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
        }else if(type==2){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
            //选择具体薪资范围
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li[4]")).click();
        }else if (type==3){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(102);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
            type=0;
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
        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
        //--------------------------任职要求项---------------------------------
        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
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
        if (type==1){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(101);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
        }else if(type==2){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div")).click();
            //选择具体薪资范围
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/ul/li[4]")).click();
        }else if (type==3){
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/div")).click();
            Thread.sleep(102);
            //选择左边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[1]/ul/li[2]")).click();
            //................................................................
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/div/input[1]")).click();
            Thread.sleep(100);
            //选择右边框
            driver.findElement(By.xpath(".//*[@id='createPositionForm']/ul/li[5]/div/div/div/div[1]/div[2]/ul/li[3]")).click();
            type=0;
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
        driver.findElement(By.name("positionResponsibility")).sendKeys(jobresponsibilities);
        //--------------------------任职要求项---------------------------------
        driver.findElement(By.name("positionRequirements")).sendKeys(jobrequirements);
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
