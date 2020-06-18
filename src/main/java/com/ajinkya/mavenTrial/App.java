package com.ajinkya.mavenTrial;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean-store.xml");
    	salad obj = (salad)context.getBean("vegetableSalad");
    	obj.chop();
    	obj.mix();
    }
}