package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String ar[]){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        College college = (College)context.getBean("collegeBean");
        college.startClass();
    }
}
