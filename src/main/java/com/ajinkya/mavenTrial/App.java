package com.ajinkya.mavenTrial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    	
    	Sauce obj2 = (Sauce) context.getBean("sauce");
    	System.out.println(obj2);
    	
    	CustomerName obj3 = (CustomerName) context.getBean("customerName");
    	System.out.println(obj3);
    	
    	// Beans using classes
    	ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
    	OrderNum num = context2.getBean(OrderNum.class);
    	System.out.println(num);
    }
}