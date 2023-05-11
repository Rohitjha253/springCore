package com.rohit.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/rohit/Spring/spring.xml");
       Vehicle vehicle=(Vehicle)context.getBean("car");
       vehicle.drive();
       //Tyre tyre=(Tyre)context.getBean("tyree");
       //System.out.println(tyre);
    }
}
