package com.crm.Test.position;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 测试嵌套.
 */

@RunWith(Suite.class)  //测试套件类
@Suite.SuiteClasses({CreatepositionTest01.class,CreatepositionTest02.class,
                     CreatepositionTest03.class,CreatepositionTest04.class,
                     CreatepositionTest05.class,CreatepositionTest06.class,
                     CreatepositionTest07.class,CreatepositionTest08.class,
                     CreatepositionTest09.class,CreatepositionTest10.class,
                     CreatepositionTest11.class,CreatepositionTest12.class}) //用数组的形式将测试的类添加到测试套件中
public class RunSuiteMain {



}

