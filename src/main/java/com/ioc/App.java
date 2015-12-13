package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.ilogic.ILogic;
import com.ioc.logic.TestLogic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ILogic logic = (TestLogic)context.getBean("testLogic");
        logic.print();
    }
}
